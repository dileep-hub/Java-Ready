package com.dileep.SimpleJava;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int sum = n;
        while (n != 0)
        {
            System.out.println("enter the number: ");
            n = in.nextInt();
            sum = sum + n;
        }
        System.out.println("sum is : " + sum);
    }
}

//output
//
//        enter the number:
//        5
//        enter the number:
//        5
//        enter the number:
//        5
//        enter the number:
//        0
//        sum is : 15
//
//        Process finished with exit code 0
