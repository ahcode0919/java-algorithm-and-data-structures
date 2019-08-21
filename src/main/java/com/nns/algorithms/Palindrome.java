package com.nns.algorithms;

import java.util.Arrays;

/**
 * Created by Aaron H. on 3/29/16.
 */
public class Palindrome {
    public static boolean isPalindrome(String word) {
        if(word.length() == 0) return false;

        char[] chars = word.toCharArray();
        int lastIndex = chars.length - 1;

        for (int i = 0; i <= lastIndex - i; i++) {
            if (chars[i] != chars[lastIndex - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean altIsPalindrome(String word) {
        if(word.length() == 0) return false;

        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        return word.equals(reversed);
    }
}