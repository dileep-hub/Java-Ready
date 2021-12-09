package com.dileep.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {2,3,1,9,7,8};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] mergesort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;

        int[] arr1 = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(arr1, arr2);

    }

    static int[] merge(int[] arr1, int[] arr2) {
        int i=0;
        int j=0;
        int k=0;

        int[] arrf = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] > arr2[j]) {
                arrf[k] = arr2[j];
                j++;
            } else {
                arrf[k] = arr1[i];
                i++;
            }
            k++;
        }

        while(i < arr1.length) {
            arrf[k] = arr1[i];
            k++;
            i++;
        }

        while(j < arr2.length) {
            arrf[k] = arr2[j];
            k++;
            j++;
        }

        return arrf;

    }

}
