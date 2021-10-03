package com.dileep;

public class pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }

    static void pattern3(int n) {
        for (int i=0; i<n; i++)  {
            for (int j=0; j<=i; j++) {
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
    }
}

//output
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5