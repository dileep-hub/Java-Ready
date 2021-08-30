package com.dileep;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr1 = new int[5];

        for (int i=0; i< arr1.length; i++)
        {
            System.out.print("enter number: ");
            arr1[i] = in.nextInt();

        }
        System.out.println(Arrays.toString(arr1));

        // Arrays of objects

        String[] str = new String[4];
        for (int i=0; i< str.length; i++)
        {
            System.out.print("enter a string: ");
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));


    }
}
