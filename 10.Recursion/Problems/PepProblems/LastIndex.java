package com.dileep.Problems.PepProblems;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        int ans = lastIndex(arr, n-1, t);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx < 0) {
            return -1;
        }

        if(arr[idx] == x) {
            return idx;
        } else {
            int ans = lastIndex(arr, idx-1, x);
            return ans;
        }
    }
}

//output
//        5
//        4
//        5
//        3
//        4
//        4
//        4
//        4