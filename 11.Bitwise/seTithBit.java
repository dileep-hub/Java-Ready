package com.dileep;

public class seTithBit {
    public static void main(String[] args) {
        System.out.println(searchBit(100, 5));
    }
    static int searchBit(int n, int b) {
        return (n | 1<<b-1);
    }
}


//here u can see 5th bit is set to 1.
//100 in binary is 1100100.
//116 in banary is 1110100.