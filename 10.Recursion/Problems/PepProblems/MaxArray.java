package com.dileep.Problems.PepProblems;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = maxOfArray(arr, 0);
        System.out.println(max);

    }

    static int maxOfArray(int[] arr, int idx) {
        if(idx == arr.length-1) {
            return arr[idx];
        }

        int max = maxOfArray(arr, idx + 1);
        if(max > arr[idx]) {
            return max;
        } else {
            return arr[idx];
        }
    }


}

//output
//
//        5
//        3
//        4
//
//        56
//        34
//        3
//        56