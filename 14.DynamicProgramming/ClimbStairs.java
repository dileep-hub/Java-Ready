package com.dileep;

public class ClimbStairs {
    public static void main(String[] args) {

        int s = climb(6);
        System.out.println(s);

        int ans2 = climb2(4, new int[4+1]);
        System.out.println(ans2);
    }

    static int climb(int steps) {
        if(steps < 0) {
            return 0;
        }
        if(steps == 0) {
            return 1;
        }

        int a1 = climb(steps-1);
        int a2 = climb(steps-2);
        int a3 = climb(steps-3);

        return a1 + a2 + a3;
    }

    static int climb2(int steps, int[] arr) {
        if(steps < 0) {
            return 0;
        }
        if(steps == 0) {
            return 1;
        }

        if(arr[steps] != 0) {
            return arr[steps];
        }

        int a1 = climb2(steps-1, arr);
        int a2 = climb2(steps-2, arr);
        int a3 = climb2(steps-3, arr);

        arr[steps] = a1+a2+a3;

        return a1 + a2 + a3;
    }

}
