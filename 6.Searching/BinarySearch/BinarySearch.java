package com.dileep;

public class BinarySearch {

    public static void main(String[] args) {
	// write your code here

        int []arr = {-1, 4, 41, 54, 76, 98, 105, 335, 494};
        int target = -1;
        int ans = binarySearch(arr, target);
        System.out.println(ans);


    }

    static int binarySearch(int[] nums, int n)
    {
//        int ind = nums.length;
        int start = 0;
        int end = nums.length-1;
        while (start <= end)
        {
            int mid = (start+end) / 2;
            if(n > nums[mid])
            {
                start = mid+1;
            }
            else if (n < nums[mid])
            {
                end = mid-1;
            }
            else return mid;
        }
        return -1;
    }
}

//output
//0