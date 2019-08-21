package com.nns.dsgnalgjava;

import java.util.Scanner;

/**
 * Created by kase on 12/13/15.
 */
public class Chapter1 {

    //1.1
    public static void inputAllBaseTypes(){

        //Base types
        double d;
        byte b;
        short s;
        long l;
        int i;
        float f;
        char c;

        //Enter all base types
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");
        i = sc.nextInt();

        System.out.println("Enter a double");
        d = sc.nextDouble();

        System.out.println("Enter a byte");
        b = sc.nextByte();

        System.out.println("Enter a short");
        s = sc.nextShort();

        System.out.println("Enter a long");
        l = sc.nextLong();

        System.out.println("Enter a float");
        f = sc.nextFloat();

        System.out.println("Enter a char");
        c = sc.next().charAt(0);

        System.out.println("You Entered: " + i + " " + d + " " + b + " " + s + " " + l + " " + f + " " + c);
    }

    //region 1.2
    public class GameObject {
        int score;

        GameObject(int initScore) {
            score = initScore;
        }
    }

    public void gameObjects() {
        GameObject [] a = new GameObject[1];
        GameObject [] b;

        a[0] = new GameObject(4);
        b = a.clone();
        b[0].score = 1000;

        System.out.println(a[0].score); //Should be 1000 Array.clone just copies the reference
    }
    //endregion

    //1.3 Is Multiple
    public boolean isMultiple(long l1, long l2){
        return (l1 % l2) == 0;
    }
}
