package com.dileep;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(magic(4));
    }
    static int magic(int n) {
        int ans = 0;
        int mul = 5;
        while (n > 0) {
            int r = n & 1;
            n = n>>1;
            ans += r * mul;
            mul *= 5;
        }
        return ans;
    }
}

//output
//125