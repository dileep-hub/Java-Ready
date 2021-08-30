package com.dileep;

public class Concatination {
    public int[] getConcatenation(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[2*n];
//        int j = 0;
//        for (int i=0; i<=(2*n)-1; i++)
//        {
//
//            if (i> n-1)
//            {
//                ans[i] = nums[j];
//                j++;
//            }
//
//            else
//            {
//                ans[i] = nums[i];
//            }
//        }
//
//        return ans;

        int[] ans = new int[2 * (nums.length)];
        for (int i = 0; i< nums.length; i++)
        {
            ans[i] = ans[nums.length + i ] = nums[i];
        }
        return ans;
    }

}
