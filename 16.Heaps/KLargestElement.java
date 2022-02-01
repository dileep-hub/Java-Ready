package com.dileep;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int val : arr) {
            pq.add(val);
        }

        for(int i=0; i<n; i++) {
            if(i>=n-k) {
                System.out.println(pq.remove());
            } else {
                pq.remove();
            }
        }
    }
}
