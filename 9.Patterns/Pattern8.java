package com.dileep;

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(4);
    }
    static void pattern8(int n) {
        int c = 2*n-1;
        for(int i=0; i<c; i++) {
            for(int j=0; j<c; j++) {
                int element = Math.max(Math.max(i, c-i-1), Math.max(j, c-j-1));
                System.out.print(element-2 + " ");
            }
            System.out.println();
        }
    }
}


//output
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4