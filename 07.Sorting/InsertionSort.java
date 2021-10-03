package com.dileep;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {24,12,-1,34,23,-122, 0,54,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr)
    {
        for(int i=0; i< arr.length-1; i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
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
//[-122, -1, 0, 7, 12, 23, 24, 34, 54]
