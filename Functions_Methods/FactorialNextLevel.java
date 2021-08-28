package com.dileep;

import java.lang.reflect.Array;
import java.util.Scanner;

public class FactorialNextLevel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = in.nextInt();

//      fact till 10
        fact(n);
    }

    static void fact(int n) {

        int count = 0;
        int fact = 1;
        for (int i = n; i > 0; i--) {
            count = count * 10 + i;
            fact = fact * i;
        }
        if (n<10) {
            System.out.println(n + "! " + count + " " + fact);
        }
        else {
            System.out.println(n + "! " + fact);
        }
    }
}

//output
//enter a number: 5
//        5! 54321 120

//    enter a number: 12
//        12! 479001600