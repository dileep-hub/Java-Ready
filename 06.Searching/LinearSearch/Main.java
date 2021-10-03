package com.dileep;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {23,12,3,67,-4,-22,4,63};
        int target = 87;
        boolean ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static boolean linearSearch(int[] nums, int n)
    {
        for(int num : nums){
            if (num == n) return true;
        }
        return false;
    }

}
