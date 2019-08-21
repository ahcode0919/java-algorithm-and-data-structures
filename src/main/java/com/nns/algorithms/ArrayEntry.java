package com.nns.algorithms;

/**
 * Created by Aaron H. on 12/14/15.
 */
public class ArrayEntry {
    public static int[] addEntry(int [] nums, int index, int value){
        int maxValue = nums.length - 1;

        if(index > maxValue || index < 0){ return nums; }
        if(index == maxValue) {
            nums[index] = value;
            return nums;
        }

        for(int i = maxValue; i > index; i--){
            nums[i] = nums[i-1];
        }
        nums[index] = value;
        return nums;
    }

    public static int[] removeEntry(int [] nums, int index) throws IndexOutOfBoundsException{
        int numEntries = nums.length;
        if(index < 0 || index >= nums.length)
            throw new IndexOutOfBoundsException();
        for(int i = index; i < numEntries; i++){
            if(i != numEntries - 1)
                nums[i] = nums[i + 1];
        }
        nums[numEntries - 1] = 0;
        return nums;
    }
}
