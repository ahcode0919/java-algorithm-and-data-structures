package com.nns.algorithms.stacks;

import java.util.Stack;

/**
 * Created by Aaron H. on 5/16/16.
 */

/**
 * A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

 Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {)
 occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type.
 There are three types of matched pairs of brackets: [], {}, and ().

 A matching pair of brackets is not balanced if the set of brackets it encloses are not matched.
 For example, {[(])} is not balanced because the contents in between { and } are not balanced.
 The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of
 parentheses encloses a single, unbalanced closing square bracket, ].

 By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:

 It contains no unmatched brackets.
 The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
 Given  strings of brackets, determine whether each sequence of brackets is balanced.
 If a string is balanced, print YES on a new line; otherwise, print NO on a new line.

 Input Format

 The first line contains a single integer, , denoting the number of strings.
 Each line  of the  subsequent lines consists of a single string, , denoting a sequence of brackets.

 Constraints

 Each character in the sequence will be a bracket (i.e., {, }, (, ), [, and ]).
 *
 */
public class CodingBrackets {
    public static boolean isBalanced(String text) {
        char[] vals = text.toCharArray();

        if(vals.length % 2 != 0) return false;

        Stack<Character> s = new Stack<>();

        for(char bracket: vals) {
            if(bracket == '{' || bracket == '[' || bracket == '(') {
                s.push(bracket);
            } else {
                if(s.empty()) return false;
                if(bracket == '}' && s.pop() != '{') {
                    return false;
                }
                if(bracket == ']' && s.pop() != '[') {
                    return false;
                }
                if(bracket == ')' && s.pop() != '(') {
                    return false;
                }
            }
        }

        return s.empty();
    }
}
