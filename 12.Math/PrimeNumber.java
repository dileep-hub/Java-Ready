package com.dileep;

public class PrimeNumber {
    public static void main(String[] args) {
//        System.out.println(isPrime(5));
        for (int i=0; i<=15; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int n) {
        if(n <= 1) return false;
        int start = 2;
        while (start * start <= n) {
            if(n%start == 0) {
                return false;
            }
            start++;
        }
        return true;
    }
}
