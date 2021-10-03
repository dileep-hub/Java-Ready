package com.dileep.SimpleJava;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = in.nextInt();
        int LN = n;

        while (n != 0)
        {
            System.out.print("enter the number: ");
            n = in.nextInt();
            if (n > LN)
            {
                LN = n;
            }
            System.out.println(n);
        }
        System.out.println("Largest number: " + LN);
    }
}

//output
//        enter the number: 4
//        enter the number: 5
//        5
//        enter the number: 3
//        3
//        enter the number: 12
//        12
//        enter the number: 43
//        43
//        enter the number: 1
//        1
//        enter the number: 3
//        3
//        enter the number: 0
//        0
//        Largest number: 43
//
//        Process finished with exit code 0
