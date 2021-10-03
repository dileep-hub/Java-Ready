package com.dileep;

public class Pattern1 {
    public static void main(String[] args) {

        pattern1(5);

    }
    static void pattern1(int n) {
        System.out.println("Pattern 1");
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}
//output
//Pattern 1
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
