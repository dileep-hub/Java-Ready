package com.dileep;

import java.util.Scanner;

public class SumOddEvenNegNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n = in.nextInt();

        System.out.println("enter the list of numbers: ");
        int[] arr = new int[n];
        for ( int i=0; i<n; i++)
        {
            arr[i] = in.nextInt();
        }

        int sumNeg = 0;
        int sumPoseven = 0;
        int sumPosodd = 0;

        for (int i=0; i<n; i++)
        {
            if (arr[i] < 0)
            {
                sumNeg += arr[i];
            }
            else if (arr[i]%2 == 0 && arr[i] > 0)
            {
                sumPoseven += arr[i];
            }
            else {
                sumPosodd += arr[i];
            }
        }
        System.out.println("sum of negative numbers is " + sumNeg);
        System.out.println("Positive even numbers sum is " + sumPoseven);
        System.out.println("Positive odd numbers sum is "+ sumPosodd);
    }
}

//output
//enter the number of elements:
//        6
//        enter the list of numbers:
//        0 1 2 -6 4 3
//        sum of negative numbers is -6
//        Positive even numbers sum is 6
//        Positive odd numbers sum is 4
//
//        Process finished with exit code 0
