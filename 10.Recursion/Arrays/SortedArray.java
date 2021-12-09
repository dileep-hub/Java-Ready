package com.dileep.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,54,34,45,344};
        System.out.println(isSort(a, 0));
    }

    static boolean isSort(int[] arr, int ind) {
        if(ind == arr.length-1) {
            return true;
        }
        return arr[ind] < arr[ind+1] && isSort(arr, ind+1);
    }

}
