package com.dileep;

import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Scanner;

public class ClimbStairsJumps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new  int[]{3, 3, 0, 2, 1, 2, 4, 2, 0, 0};
        int ans = climb(10, arr, new int[11]);
        System.out.println(ans);
    }

    static int climb(int steps, int[] arr1, int[] arr2) {
        if(steps == 0) {
            return 1;
        } else if(steps < 0) {
            return 0;
        }

        if(arr2[steps] != 0) {
            return arr2[steps];
        }

        int count = 0;
        for(int i=1; i<= arr1[arr1.length - steps ]; i++ ) {
              count += climb(steps-i, arr1, arr2);
        }

        arr2[steps] = count;

        return count;

    }

}
