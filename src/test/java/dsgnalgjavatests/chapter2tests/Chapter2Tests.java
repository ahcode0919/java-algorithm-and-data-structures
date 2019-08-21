package dsgnalgjavatests.chapter2tests;

import com.nns.helpers.HelperFunctions;
import com.nns.dsgnalgjava.GenericDemo;
import com.nns.dsgnalgjava.ObjectPair;
import com.nns.dsgnalgjava.Pair;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by kase on 12/13/15.
 */
public class Chapter2Tests {
    @Test
    public void createObjectTest(){
        Object a = "Stuff";
        Object b = 23.67;

        ObjectPair objectPair = new ObjectPair(a,b);
        Assert.assertTrue(objectPair.getFirst().equals(a));
        Assert.assertTrue((objectPair.getSecond().equals(b)));
    }

    @Test
    public void createPairTest(){
        String s = "Stuff";
        double d = 23.67;

        Pair pair = new Pair<>(s,d);
        Assert.assertTrue(pair.getFirst().equals(s));
        Assert.assertTrue((pair.getSecond().equals(d)));
    }

    @Test
    public void genericDemoTest(){
        Integer [] nums = {1,2,3,4};
        GenericDemo.reverse(nums);
        Assert.assertTrue(Arrays.equals(nums, new Integer[] {4,3,2,1}));
        HelperFunctions.printArray(nums);
    }

    @Test
    public void genericPrimitiveDemoTest(){
        int [] nums = {1,2,3,4};
        Integer [] nums2 = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++){
            nums2[i] = nums[i];
        }
        GenericDemo.reverse(nums2);
        HelperFunctions.printArray(nums2);
    }
}
