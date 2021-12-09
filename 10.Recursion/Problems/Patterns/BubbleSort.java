package com.dileep.Problems.Patterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {1,5,6,4,9, 3};
//        System.out.println("Bef");
        System.out.println("Before sort:  " + Arrays.toString(arr));
        bubble(arr, arr.length-1, 0);
        System.out.println("After sort :  " + Arrays.toString(arr));

//        int[] arr1 = {1,5,6,4,3,9};
//        arr1[2] = 34;
//        System.out.println(Arrays.toString(arr1));
    }

    static void bubble(int[] arr, int  n, int m) {
        if(n == 0) {
            return;
        } else if(n > m) {
            if(arr[m] > arr[m+1]) {
                int temp = arr[m+1];
                arr[m+1] = arr[m];
                arr[m] = temp;
            }
                bubble(arr, n, m+1);
        }
        else {
            bubble(arr, m-1, 0);
        }
    }
}
