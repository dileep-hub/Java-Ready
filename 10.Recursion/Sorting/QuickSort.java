package com.dileep.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {4,5,4,1,6,8,4,5,3,2};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr, int low,int high) {
        if(low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s) / 2;
        int pivot = arr[m];

        while(s <= e) {
            while(arr[s] < pivot ) {
                s++;
            }
            while(arr[e] > pivot) {
                e--;
            }

            if(s <= e) {
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                s++;
                e--;
            }

        }

        sort(arr, low, e);
        sort(arr, s, high);

    }


}
