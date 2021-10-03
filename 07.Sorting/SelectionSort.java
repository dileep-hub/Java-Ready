package com.dileep;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {24,12,-1,34,23,-122, 0,54,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int lastInd = arr.length-i-1;
            int maxInd = max(arr, 0, lastInd+1);
            swap(arr,maxInd, lastInd);
        }
    }

    static int max(int[] arr,int start,int end)
    {
        int max = start;
        for(int i=start; i< end; i++)
        {
            if(arr[i] > arr[max] )
            {
                max = i;
            }
        }
        return max;
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