package com.nns.helpers;

import java.util.Random;

/**
 * Created by Aaron H. on 12/13/15.
 */
public class HelperFunctions {
    public static <T> void printArray(T[] data){
        System.out.print("Array: ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i].toString() + " ");
        }
        System.out.println();
    }

    public static Integer[] returnObjectArray(int [] data){
        Integer [] nums2 = new Integer[data.length];
        for (int i = 0; i < data.length; i++){
            nums2[i] = data[i];
        }
        return nums2;
    }

    public static Character [] returnObjectArray(char [] data){
        Character [] char2 = new Character[data.length];
        for (int i = 0; i < data.length; i++){
            char2[i] = data[i];
        }
        return char2;
    }

    public static char [] generateRandomCharArray(int values){
        char [] array = new char[values];
        Random random = new Random(System.currentTimeMillis());
        for(int i = 0; i < values; i++){
            array[i] = (char) (random.nextInt(26) + 'a');
        }
        return array;
    }

    public static int[] generateRandomIntArray(int values){
        int [] array = new int[values];
        Random random = new Random(System.currentTimeMillis());
        for(int i = 0; i < values; i++){
            array[i] = random.nextInt();
        }
        return array;
    }


    public static boolean isOrderedArray(char [] data){
        int maxIndex = data.length - 1;
        for(int i = 0; i < maxIndex; i++){
            if(data[i] > data[i + 1])
                return false;
        }
        return true;
    }
}
