package com.dileep.Problems;

public class countZeros {

    static int countzero(int n) {
        return helper(n, 0); // here c:0 means count of zero
    }

    private static int helper(int n, int c) {
        if(n <= 0) {
            return c;
        }
        int rem = n%10;
        if(rem == 0) {
            return helper(n/10, c+1);
        }
        else {
            return helper(n/10, c);
        }
    }

    public static void main(String[] args) {
        int ans = countzero(1030300033);
        System.out.println(ans);

    }
}
