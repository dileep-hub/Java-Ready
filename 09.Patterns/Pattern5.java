package com.dileep;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(4);
    }
    static void pattern5(int n) {

        for (int i=0; i<2*n-1; i++) {
            int space = i>=n ? i-n+1 : n-i-1;
            for( int j=0; j<space; j++) {
                System.out.print(" ");
            }
            int star = n-space;
            for (int j=0; j<star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
//
////output
//
//           *
//          * *
//         * * *
//        * * * *
//         * * *
//          * *
//           *
