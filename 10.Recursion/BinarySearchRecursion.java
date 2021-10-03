package com.dileep;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] ar = {1,4,6,34,67,87,90};
        int ans = bs(ar, 87, 0, ar.length-1);
        System.out.println(ans);
    }
    static int bs(int[] arr, int target, int s, int e) {
        if(s>e) return -1;
        int mid = s + (e-s) / 2;
        if(arr[mid] == target) return mid;
        if (arr[mid] > target) {
            return bs(arr, target, s, mid-1);
        }
        else return bs(arr, target, mid+1, e);
    }

}

///output
//5
