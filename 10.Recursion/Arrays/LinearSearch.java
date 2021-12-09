package com.dileep.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1,4,34,56,78,98};
        System.out.println(search(a, 758, 0));
        System.out.println(searchInd(a, 78, 0));
    }

    static boolean search(int[] arr, int target, int ind) {
        if (ind == arr.length) {
            return false;
        }
        return arr[ind] == target || search(arr, target, ind+1);
    }

    static int searchInd(int[] arr, int target, int ind) {
        if (ind == arr.length) {
            return -1;
        }
        if(arr[ind] == target) {
            return ind;
        }
        return searchInd(arr, target, ind+1);
    }
}
