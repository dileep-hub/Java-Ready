package com.dileep;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int val : arr) {
            hm.put(val, true);
        }

        for(int val : arr) {
            if(hm.containsKey(val-1)) {
                hm.put(val, false);
            }
        }

        int maxLen = 0;
        int maxStartPoint = 0;

        for (int val : arr) {
            if(hm.get(val) == true) {
                int tsp = val;
                int tl = 1;

                while (hm.containsKey(tsp + 1)) {
                    tl++;
                }

                if(tl > maxLen) {
                    maxLen = tl;
                    maxStartPoint = tsp;
                }
            }
        }

        for (int i = 0; i < maxLen; i++) {
            System.out.println(maxStartPoint+i);
        }

    }
}
