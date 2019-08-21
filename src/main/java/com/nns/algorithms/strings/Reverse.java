package com.nns.algorithms.strings;

/**
 * Created by Aaron H. on 4/5/16.
 */
public class Reverse {
    public static String reverseCharArray(String text) {
        if(text.length() <= 1) return text;

        int chars = text.length() - 1;
        char [] reversedString  = new char[chars + 1];

        for(int i = chars; i >= 0; i--) {
            reversedString[i] = text.charAt(chars - i);
        }

        return new String(reversedString);
    }

    public static String reverseInPlace(String text) {
        if(text.length() <= 1) return text;

        char [] orig = text.toCharArray();
        char temp;
        int length = text.length() - 1;

        for (int i = 0 ; i < length - i; i++) {
            temp = orig[i];
            orig[i] = orig[length - i];
            orig[length - i] = temp;
        }

        return new String(orig);
    }

    public static String reverseInPlaceNoSwap(String text) {
        if(text.length() <= 1) return text;

        char [] orig = text.toCharArray();
        int length = text.length() - 1;

        for (int i = 0 ; i < length - i; i++) {
            orig[i] += orig[length - i]; //5 3 = 8 3
            orig[length - i ] = (char) (orig[i] - orig[length - i]); // 8 5
            orig[i]  = (char) (orig[i] - orig[length - i]);
        }

        return new String(orig);
    }

    public static String reverseStringBuilder(String text) {
        if(text.length() <= 1) return text;

        int length = text.length();
        StringBuilder sb = new StringBuilder();

        for(int i = length - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }

        return sb.toString();
    }

    public static String reverseStringBuilderReverse(String text) {
        if(text.length() <= 1) return text;

        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
}
