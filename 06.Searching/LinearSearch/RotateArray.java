package com.dileep;

import java.util.Arrays;

public class TwoSumII {
        public static void main(String[] args) {

                int[] numbers = {1,2,3,4,5,6};
                rotate(numbers, 5);
            System.out.println(Arrays.toString(numbers));
         }

         static void rotate(int[] arr, int n)
         {
             int k = 1;
             while (k<=n) {
                 int[] nums = new int[arr.length];
                 for (int i = 0; i < arr.length; i++) {
                     nums[i] = arr[i];
                 }
                 int l = arr.length - 1;
                 arr[l] = nums[0];
                 for (int j = 0; j < arr.length - 1; j++) {
                     arr[j] = nums[j + 1];
                     l--;
                 }
                 k++;
             }
         }
}

//output
//[6, 1, 2, 3, 4, 5]
