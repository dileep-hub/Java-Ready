package com.dileep;

public class OrderAgnosticBS {
    public static void main(String[] args) {

//        int []arr = {-1, 4, 41, 54, 76, 98, 105, 335, 494};
        int []arr = {500, 450, 344, 295, 144, 120, 99, 34, 20, 1, -4};
        int target = 450;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);

    }

    static int orderAgnostic(int[] nums, int n)
    {
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            if (nums[start] < nums[end])
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
            else {
                int mid = (start+end) / 2;
                if(n > nums[mid])
                {
                    end = mid-1;
                }
                else if (n < nums[mid])
                {
                    start = mid+1;
                }
                else return mid;
            }
        }
        return -1;
    }

}

// output
// 1