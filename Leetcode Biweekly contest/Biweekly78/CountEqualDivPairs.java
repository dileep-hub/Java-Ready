package com.dileep.Biweekly78;

public class CountEqualDivPairs {
    public static void main(String[] args) {

        int nums[] = {5,5,9,2,5,5,9,2,2,5,5,6,2,2,5,2,5,4,3};
        int k = 7;
        int ans = countPairs(nums, k);
        System.out.println(ans);

    }

    public static int countPairs(int[] nums, int k) {

        int count = 0;

        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j< nums.length; j++) {
                if(nums[i] == nums[j] && i*j % k == 0) {
                    count++;
                }
            }
        }

        return count;

    }

}
