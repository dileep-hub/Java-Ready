package com.dileep.Problems;

public class ReverseNum {

    static int sum = 0;
    static void rev1(int n) {
        if(n <= 0) {
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev1(n/10);
    }

    static int rev2(int n, int m) {
        if(n <= 0) {
            return 0;
        }
        int rem = n%10;
        return (int) (rem * Math.pow(10, m-1) + rev2(n/10, m-1));
    }

    public static void main(String[] args) {
        rev1(738464);
        System.out.println(sum);
        System.out.println(rev2(1234455, 7));
    }
}
