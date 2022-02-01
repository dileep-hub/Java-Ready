package com.dileep;

import com.sun.java.util.jar.pack.PackerImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortKsortedArray {
    public static void main(String[] args) {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();


        // method1
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : arr) {
            pq.add(val);
        }

        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }

        // method 2

        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0; i<=k; i++) {
            p.add(arr[i]);
        }

        for(int i=k+1; i<arr.length; i++) {
            System.out.println(p.remove());
            p.add(arr[i]);
        }

        if(p.size() > 0) {
            System.out.println(p.remove());
        }

    }
}

//input
//        9
//        3
//        2
//        4
//        1
//        6
//        5
//        7
//        9
//        8
//        3
//
                //output

//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        1
//        2
//        3
//        4
//        5
//        6