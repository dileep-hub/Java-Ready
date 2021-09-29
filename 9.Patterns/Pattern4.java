package com.dileep;

public class Pattern4 {
    public static void main(String[] args) {

        pattern4(5);

    }
    static void pattern4(int n) {
        for (int i = 0; i < (2*n)-1; i++) {
            int notimes = i >= n ? (2*n) - i -1 : i+1;
            for (int j=0; j<notimes; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *