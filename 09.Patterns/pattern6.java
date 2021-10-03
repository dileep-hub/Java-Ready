package com.dileep;

public class pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n) {
        for (int i=0; i<n; i++) {
            int space = n-i-1;
            for( int j=0; j<space; j++) {
                System.out.print("  ");
            }
            for(int k=i+1; k>=1; k--) {
                System.out.print(k + " ");
            }
            for(int m=2; m<=i+1; m++) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

////output
//                1
//              2 1 2
//            3 2 1 2 3
//          4 3 2 1 2 3 4
//        5 4 3 2 1 2 3 4 5