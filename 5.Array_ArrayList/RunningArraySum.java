package com.dileep;

public class RunningArraySum {
    public int[] runningSum(int[] nums) {
//        // modify the input array, adding n[i] with n[i-1]
//        for(int i = 1; i < nums.length; i++) {
//            nums[i] += nums[i-1];
//        }
//
//        // return the modified array
//        return nums;
        //or

        int[] res = new int[nums.length];
        int sum = 0;
        for (int i=0; i < nums.length; i++)
        {
            sum += nums[i];
            res[i] = sum;
        }
        return res;

    }
    }

