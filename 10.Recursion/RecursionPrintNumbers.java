package com.dileep;

public class RecursionPrintNumbers {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        while (n==10) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

}

//output
//        5
//        6
//        7
//        8
//        9
//        10