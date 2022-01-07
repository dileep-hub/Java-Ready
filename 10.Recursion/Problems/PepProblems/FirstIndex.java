package com.dileep.Problems.PepProblems;

import java.util.Scanner;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        int ans = firstIndex(arr, 0, t);
        System.out.println(ans);

    }

    public static int firstIndex(int[] arr, int idx, int x){

        if(idx == arr.length) {
            return -1;
        }

        if(arr[idx] == x) {
            return idx;
        } else {
            int ans = firstIndex(arr, idx+1, x);
            return ans;
        }

    }


}

//output
//5
//        3
//        4
//        3
//        4
//        3
//        4
//        1