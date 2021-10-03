package com.dileep;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 2D array
        int[][]  arr1 = new int[3][3];

        for (int row=0; row< arr1.length; row++)
        {
            for (int j=0; j<arr1[row].length; j++)
            {
                System.out.print("enter number: ");
                arr1[row][j] = in.nextInt();
            }
        }

        for (int row=0; row< arr1.length; row++)
        {
            for (int j=0; j<arr1[row].length; j++)
            {
                System.out.print(arr1[row][j]+ " ");
            }
            System.out.println();
        }

        for (int i=0; i<arr1.length; i++)
        {
            System.out.println(Arrays.toString(arr1[i]));
        }

    }
}

//output
//enter number: 1
//        enter number: 2
//        enter number: 3
//        enter number: 4
//        enter number: 5
//        enter number: 6
//        enter number: 7
//        enter number: 8
//        enter number: 9
//        1 2 3
//        4 5 6
//        7 8 9
//        [1, 2, 3]
//        [4, 5, 6]
//        [7, 8, 9]
//
//        Process finished with exit code 0
