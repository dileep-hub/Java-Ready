package com.dileep;

import java.util.HashMap;
import java.util.Scanner;

public class GetCommonEle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int[] arr2 = new int[n1];
        for(int i=0; i<n2; i++) {
            arr2[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int val : arr1) {
            if(hm.containsKey(val)) {
                int n = hm.get(val);
                hm.put(val, n+1);
            } else {
                hm.put(val, 1);
            }
        }

        for(int val : arr2) {
            if(hm.containsKey(val) && hm.get(val) > 0) {
                System.out.println(val);
                int n = hm.get(val);
                hm.put(val, n-1);
            }
        }
    }
}

//output
//        7
//        1
//        1
//        2
//        2
//        2
//        3
//        5
//        7
//        1
//        1
//        1
//        2
//        2
//        4
//        5
//        1
//        1
//        2
//        2
//        5
