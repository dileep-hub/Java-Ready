package com.dileep;

public class FindPivot {
    public static void main(String[] args) {

        // only works to find pivot in binary sorted array
//        int[] nums = {5,7,8, 14,122,1,2};
        int[] nums2 = {1,2,3,4};
        System.out.println(findPivot(nums2));
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


}
