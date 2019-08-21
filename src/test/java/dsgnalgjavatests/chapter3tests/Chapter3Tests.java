package dsgnalgjavatests.chapter3tests;

import com.nns.algorithms.ArrayEntry;
import com.nns.algorithms.CaesarCipher;
import com.nns.dsgnalgjava.InsertionSort;
import com.nns.datastructures.CircularlyLinkedList;
import com.nns.datastructures.DoubleLinkedList;
import com.nns.datastructures.SinglyLinkedList;
import com.nns.helpers.HelperFunctions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import static com.nns.helpers.HelperFunctions.isOrderedArray;

/**
 * Created by Aaron H. on 12/14/15.
 */
public class Chapter3Tests {

    long time;

    @BeforeMethod
    public void beforeMethod(Method method){
        time = 0;
        time = System.currentTimeMillis();
        System.out.println(method.getName());
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Test time: " + (System.currentTimeMillis() - time) + "ms\n");
    }

    @Test
    public void checkArrayEntryAddElement(){
        int[] test = ArrayEntry.addEntry(new int[] {1,2,3,4}, 2, 10);
        Integer[]obj = HelperFunctions.returnObjectArray(test);
        HelperFunctions.printArray(obj);

        System.out.println("");

        test = ArrayEntry.addEntry(new int[] {0}, 0, 10);
        obj = HelperFunctions.returnObjectArray(test);
        HelperFunctions.printArray(obj);


        System.out.println("");

        test = ArrayEntry.addEntry(new int[] {1}, -2, 10);
        obj = HelperFunctions.returnObjectArray(test);
        HelperFunctions.printArray(obj);
    }

    @Test
    public void checkArrayRemoveEntryTest(){
        int [] test = ArrayEntry.removeEntry(new int[] {1,2,3,4}, 1);
        Integer [] obj = HelperFunctions.returnObjectArray(test);
        HelperFunctions.printArray(obj);

        Assert.assertTrue(test[1] == 3);
        Assert.assertTrue(test[3] == 0);
    }

    @Test
    public void insertionSortTest(){
        char [] unorderedChars = {'f', 'g', 'a', 'c', 'b', 'd','e'};
        char [] orderedChars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        unorderedChars = InsertionSort.insertionSort(unorderedChars);
        HelperFunctions.printArray(HelperFunctions.returnObjectArray(unorderedChars));
        Assert.assertTrue(Arrays.equals(orderedChars, unorderedChars));

        unorderedChars = new char[] {'a'};
        orderedChars = new char[] {'a'};
        unorderedChars = InsertionSort.insertionSort(unorderedChars);
        HelperFunctions.printArray(HelperFunctions.returnObjectArray(unorderedChars));
        Assert.assertTrue(Arrays.equals(orderedChars, unorderedChars));

        unorderedChars = HelperFunctions.generateRandomCharArray(100000);
        unorderedChars = InsertionSort.insertionSort(unorderedChars);
        HelperFunctions.printArray(HelperFunctions.returnObjectArray(unorderedChars));
        Assert.assertTrue(isOrderedArray(unorderedChars));
    }

    @Test
    public void hashSortTest(){
        int numOfChars = 100000;
        char [] unorderedChars = HelperFunctions.generateRandomCharArray(numOfChars);
        unorderedChars = InsertionSort.hashSort(unorderedChars);
        HelperFunctions.printArray(HelperFunctions.returnObjectArray(unorderedChars));
        Assert.assertTrue(isOrderedArray(unorderedChars));
        Assert.assertTrue(numOfChars == unorderedChars.length);
    }

    @Test
    public void caesarCipherTest(){
        CaesarCipher cc = new CaesarCipher(0);
        String test = "ABCDEFGHIJKLMNOPQRSTUVWXZY ";
        Assert.assertTrue(test.equals(cc.encodeString(test)));
        Assert.assertTrue(test.equals(cc.decodeString(test)));

        cc = new CaesarCipher(23623);
        test = "HELLO WORLD";
        String encrypted = cc.encodeString(test);
        System.out.println(encrypted);
        String decrypted = cc.decodeString(encrypted);
        Assert.assertTrue(test.equals(decrypted));
        System.out.println(decrypted);
    }

    @Test
    public void singlyLinkedListZeroElements(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        Assert.assertTrue(list.size() == 0);
        Assert.assertTrue(list.removeFirst() == null);
    }

    @Test
    public void singlyLinkedListAddElement(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>("Stuff");
        list.addElement("Stuff2");
        Assert.assertTrue(list.size() == 2);
        Assert.assertTrue(list.last().equals("Stuff"));
        Assert.assertTrue(list.removeFirst().equals("Stuff2"));
    }

    @Test
    public void singlyLinkedListRemoveElement(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>("Stuff");
        list.addElement("Stuff2");
        Assert.assertTrue(list.removeFirst().equals("Stuff2"));
        Assert.assertTrue(list.removeFirst().equals("Stuff"));
    }

    @Test
    public void circularlyLinkedListZeroElements(){
        CircularlyLinkedList<String> list = new CircularlyLinkedList<>();
        Assert.assertTrue(list.size() == 0);
        Assert.assertTrue(list.removeFirst() == null);
    }

    @Test
    public void circularlyLinkedListAddElement(){
        CircularlyLinkedList<String> list = new CircularlyLinkedList<>("Stuff");
        list.addElement("Stuff2");
        Assert.assertTrue(list.size() == 2);
        Assert.assertTrue(list.last().equals("Stuff"));
        Assert.assertTrue(list.removeFirst().equals("Stuff2"));
    }

    @Test
    public void circularlyLinkedListRemoveElement(){
        CircularlyLinkedList<String> list = new CircularlyLinkedList<>("Stuff");
        list.addElement("Stuff2");
        Assert.assertTrue(list.removeFirst().equals("Stuff2"));
        Assert.assertTrue(list.removeFirst().equals("Stuff"));
    }

    @Test
    public void circularlyLinkedListRotate(){
        CircularlyLinkedList<String> list = new CircularlyLinkedList<>("Stuff");
        list.addElement("Stuff2");
        Assert.assertTrue(list.first().equals("Stuff2"));
        Assert.assertTrue(list.last().equals("Stuff"));
        list.rotate();
        Assert.assertTrue(list.first().equals("Stuff"));
        Assert.assertTrue(list.last().equals("Stuff2"));
    }

    @Test
    public void doubleLinkedListEmpty(){
        DoubleLinkedList<String> dblll = new DoubleLinkedList<>();
        Assert.assertTrue(dblll.size() == 0);
        Assert.assertTrue(dblll.first() == null);
        Assert.assertTrue(dblll.last() == null);
        Assert.assertTrue(dblll.isEmpty());
        Assert.assertTrue(dblll.removeFirst() == null);
        Assert.assertTrue(dblll.removeLast() == null);
    }

    @Test
    public void doubleLinkedListWithElements(){
        DoubleLinkedList<String> dblll = new DoubleLinkedList<>();
        dblll.addFirst("Test");
        Assert.assertTrue(dblll.size() == 1);
        Assert.assertTrue(dblll.first().equals("Test"));
        Assert.assertTrue(dblll.last().equals("Test"));
        Assert.assertTrue(!dblll.isEmpty());
        Assert.assertTrue(dblll.removeFirst().equals("Test"));
        Assert.assertTrue(dblll.removeLast() == null);
        Assert.assertTrue(dblll.size() == 0);
    }

    @Test
    public void doubleLinkedListRemoveElement(){
        DoubleLinkedList<String> dblll = new DoubleLinkedList<>();
        dblll.addFirst("Test");
        dblll.addLast("Test2");
        Assert.assertTrue(dblll.size() == 2);
        Assert.assertTrue(dblll.first().equals("Test"));
        Assert.assertTrue(dblll.last().equals("Test2"));
        Assert.assertTrue(!dblll.isEmpty());
        Assert.assertTrue(dblll.removeFirst().equals("Test"));
        Assert.assertTrue(dblll.removeLast().equals("Test2"));
        Assert.assertTrue(dblll.size() == 0);
    }

    @Test
    public void doubleLinkedListRemoveElementAt(){
        DoubleLinkedList<String> dblll = new DoubleLinkedList<>();
        dblll.addFirst("Test1");
        dblll.addLast("Test2");
        dblll.addLast("Test3");
        dblll.removeElementAt(1);
        Assert.assertTrue(dblll.size() == 2);
        Assert.assertTrue(dblll.first().equals("Test1"));
        Assert.assertTrue(dblll.last().equals("Test3"));
    }

    @Test
    public void doubleLinkedListInsertElementAt(){
        DoubleLinkedList<String> dblll = new DoubleLinkedList<>();
        dblll.addFirst("Test1");
        dblll.addFirst("Test2");
        dblll.addFirst("Test3");
        dblll.insertElementAt(1, "TestInsert");
        Assert.assertTrue(dblll.removeElementAt(1).equals("TestInsert"));
    }
}
