package com.dileep;

import java.util.HashMap;
import java.util.Scanner;

public class GetCommonEle1 {
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
            if(hm.containsKey(val)) {
                System.out.println(val);
                hm.remove(val);
            }
        }
    }
}

//output
//4
//        1 1 2 3
//        4
//        1 7 4 2
//        1
//        2