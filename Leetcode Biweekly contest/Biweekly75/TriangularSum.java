package com.dileep.Biweekly75;

public class TriangularSum {
    public static void main(String[] args) {


        int[] ar = new int[] {5};
        System.out.println(triangularSum(ar));

//
    }

    public static int triangularSum(int[] nums) {

        int len = nums.length;

        for(int i=0; i<len-1; i++) {
            int[] newNums = new int[len-1-i];
            for(int j=0;j<newNums.length; j++) {
                newNums[j] = (nums[j] + nums[j+1]) % 10;
            }
            nums = newNums;
        }

        return nums[0];


    }

    }

//}
