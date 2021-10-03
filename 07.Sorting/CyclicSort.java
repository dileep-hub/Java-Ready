package com.dileep;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2,1, 4, 7, 9, 6, 8};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr)
    {
        int i=0;
        while(i< arr.length-1)
        {
            if(arr[i] != i+1)
            {
                swap(arr, i, arr[i]-1);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

//output
//[1, 2, 3, 4, 5, 6, 7, 8, 9]
