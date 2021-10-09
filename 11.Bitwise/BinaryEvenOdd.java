package com.dileep;

public class BinaryEvenOdd {
    public static void main(String[] args) {
        System.out.println(isodd(10));
    }
    static boolean isodd(int n) {
        if((n & 1) == 1) return true;
        return false;
    }
}

//output
//false