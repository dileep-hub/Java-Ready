package com.dileep;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
	// write your code here

        int[] arr1 = {3,-1, 0, 78, 45, 2, 1, 333};
        bubble(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void bubble(int[] arr)
    {
        // runs n-1 times
        for (int i = 0; i < arr.length; i++) {
            // just to confirm if array is aready in ascending order
            boolean swapped = false;
            // iterates each element from index 1 to (n-1)
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
            {
                break;
            }
        }
    }

}

//output
//[-1, 0, 1, 2, 3, 45, 78]
//
//        Process finished with exit code 0
