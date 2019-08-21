package com.nns.algorithms.stacks;

/**
 * Created by Aaron H. on 5/17/16.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 You have an empty sequence, and you will be given  queries. Each query is one of these three types:

 1 x  -Push the element x into the stack.
 2    -Delete the element present at the top of the stack.
 3    -Print the maximum element in the stack.

 Input Format
 The first line of input contains an integer, . The next  lines each contain an above mentioned query.
 (It is guaranteed that each query is valid.)

 Output Format
 For each type  query, return the maximum element in the stack on a new line.

 Sample Input
 10
 1 97
 2
 1 20
 2
 1 26
 1 20
 2
 3
 1 91
 3
 Sample Output

 26
 91
 *
 */
public class MaxElement {
    public static int[] maxElement(String nums) throws IllegalArgumentException {
        if(nums == null || nums.length() == 0) {
            throw new IllegalArgumentException("Number parameter zero or null");
        }

        Scanner sc = new Scanner(nums);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        ArrayList<Integer> maxNumbers = new ArrayList<>();

        int tc = sc.nextInt();

        for(int i = 0; i < tc; i++) {
            int command = sc.nextInt();
            if(command == 1) {
                int val = sc.nextInt();
                st.push(val);

                try {
                    if(val >= maxStack.peek()) maxStack.push(val);
                } catch(Exception e) {
                    maxStack.push(val);
                }
            } else if(command == 2) {
                if(st.pop().equals(maxStack.peek())) maxStack.pop();
            } else {
                maxNumbers.add(maxStack.peek());
            }
        }
        return maxNumbers.stream().mapToInt(i -> i).toArray();
    }
}
