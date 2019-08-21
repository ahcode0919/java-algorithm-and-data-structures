package com.nns.dsgnalgjava;

/**
 * Created by Aaron H. on 12/13/15.
 */
public class GenericDemo {
    public static <T> void  reverse(T[]data){
        int low = 0, high = data.length - 1;
        if(high <= 1) return;

        T temp;

        for(int i = low; i < high - i; i++){
            temp = data[i];
            data[i] = data[high - i];
            data[high - i] = temp;
        }
    }
}
