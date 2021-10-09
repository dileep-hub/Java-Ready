package com.dileep;

public class RangeOfXOR {
    public static void main(String[] args) {
        System.out.println(xor(4));

        // using for loop
        int ans = 0;
        for(int i=0; i<=4; i++) {
            ans ^= i;
        }
        System.out.println(ans);
    }
    static int xor(int a ) {
        if(a%4 == 0) {
            return a;
        }
        if(a%4 == 1) {
            return 1;
        }
        if(a%4 == 2) {
            return a+1;
        }
        return 0;
    }
}

// output
//4
//4