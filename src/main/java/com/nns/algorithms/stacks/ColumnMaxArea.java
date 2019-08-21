package com.nns.algorithms.stacks;

/**
 * Created by Aaron H. on 5/25/16.
 */

import java.util.Scanner;
import java.util.Stack;

/**
 There are N buildings in a certain two-dimensional landscape. Each building has a height given by H.
 If you join N adjacent buildings, they will form a solid rectangle of area .

 Given N buildings, find the greatest such solid area formed by consecutive buildings.

 Input Format
 The first line contains , the number of buildings altogether.
 The second line contains  space-separated integers, each representing the height of a building.

 Constraints

 Output Format
 One integer representing the maximum area of rectangle formed.
 */
public class ColumnMaxArea {
    public int calcMaxColumnArea(String data) {
        if (data == null || data.length() == 0) return 0;

        Scanner sc = new Scanner(data);
        int items = sc.nextInt();
        int[] heights = new int[items];

        for (int i = 0; i < items; i++) {
            heights[i] = sc.nextInt();
        }

        return calcMaxHeight(heights);
    }

    public static int calcMaxHeight(int[] nums) {
        if (nums.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();

        int max = 0;

        //Instead count forward in array until a lower num is found and save to max
        for (int i = 0; i < nums.length; i++) {
            if (stack.empty() || stack.peek() >= nums[i]) {
                stack.push(nums[i]);
            } else {
                while (!stack.empty() && stack.peek() < nums[i]) {
                    stack.pop();
                }
                stack.push(nums[i]);
            }
            max = stack.peek() * stack.size();
            System.out.println(max);
        }
        return max;
    }
}