package com.dileep;

public class OnceRepeat {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,1,2};
        System.out.println(once(arr));
    }
    static int once(int[] arr) {
        int unique = 0;
        for (int a : arr) {
            unique ^= a;
        }
        return unique;
    }
}

//output
//4