package com.dileep;

import java.util.Scanner;

public class MaxMinNumIn3Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter 3 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        max(a, b, c);
        min(a, b, c);
    }

    static void max(int num1, int num2, int num3)
    {
        int[] arr = {num1, num2, num3};
        int max = arr[0];
        for (int i=1; i< arr.length; i++)
        {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max number is : " + max);
    }

    static void min(int num1, int num2, int num3)
    {
        int[] arr = {num1, num2, num3};
        int min = arr[0];
        for (int i=1; i< arr.length; i++)
        {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min number is : " + min);
    }
}

////output
//enter 3 numbers: 45 38394 363
//        Max number is : 38394
//        Min number is : 45