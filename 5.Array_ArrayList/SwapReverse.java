package com.dileep;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr1)
    {
        int start = 0;
        int end = arr1.length-1;
        while (start < end)
        {
            swap(arr1, start, end);
            start++;
            end--;
        }

    }


    static void swap(int[] arr2, int pos1, int pos2)
    {
        int temp = arr2[pos1];
        arr2[pos1] = arr2[pos2];
        arr2[pos2] = temp;
    }
}

