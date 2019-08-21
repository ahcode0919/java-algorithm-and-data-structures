package com.nns.dsgnalgjava;

import sun.tools.tree.CharExpression;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Aaron H. on 12/17/15.
 */
public class InsertionSort {
    public static char[] insertionSort(char [] data){
        for(int i = 1; i < data.length; i++){
            int j = i;
            char current = data[i];
            while(j > 0 && data[j - 1] > current){
                data[j] = data[j-1];
                j--;
            }
            data[j] = current;
        }
        return data;
    }

    public static <T extends Comparable<T>> T[] insertionSort(T [] data){
        for(int i = 1; i < data.length; i++){
            int j = i;
            T current = data[i];
            while(j > 0 && data[j - 1].compareTo(current) > 0){
                data[j] = data[j-1];
                j--;
            }
            data[j] = current;
        }
        return data;
    }

    public static char[] hashSort(char [] data){
        HashMap<Character, AtomicInteger> values = new HashMap<>();
        char [] sortedArray = new char[data.length];
        for(char c : data){
            if(values.containsKey(c))
                values.get(c).getAndIncrement();
            else
                values.put(c,new AtomicInteger(1));
        }
        Character [] keySet = values.keySet().toArray(new Character[values.size()]);

        int start = 0;
        int end = 0;

        for(Character c: keySet){
            end += values.get(c).intValue();

            for(int i = start; i < end; i++){
                sortedArray[i] = c;
            }
            start = end;
        }
        return sortedArray;
    }

    private static int computeIntArrayTotal( Integer [] data){
        int total = 0;
        for(Integer i: data){
            total += i;
        }
        return total;
    }
}
