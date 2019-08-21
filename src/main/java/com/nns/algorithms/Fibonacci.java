package com.nns.algorithms;

/**
 * Created by kase on 12/13/15.
 */
public class Fibonacci {
    public int getFibonacci(int n1, int n2, int iterations){
        int num1 = n1;
        int num2 = n2;
        int temp;

        if(iterations < 0)
            throw new IllegalArgumentException("Iterations must be 0 or greater");

        System.out.println(num1 + " " + num2);

        for(int i = 0; i < iterations; i++)
        {
            temp = num1;
            num1 = num2;

            if(temp < Integer.MAX_VALUE - num2){
                num2 = temp + num2;
                System.out.println(num2);
            }
            else{
                System.out.println("Max Int value reached");
                return num1;
            }
        }
        return num2;
    }

    public int recursiveFibonacci(int n1, int n2, int iterations){
        int num1 = n1, num2 = n2;

        System.out.println(num2);

        if(iterations > 0){
            num1 = n2;
            num2 = n1 + n2;
        }

        if(iterations - 1 > 0)
            num2 = recursiveFibonacci(num1, num2, iterations - 1);
        return num2;
    }
}
