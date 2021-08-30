package com.dileep;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = in.nextInt();

        isevenOdd(n);
    }
    static void isevenOdd(int m){
        if (m%2 == 0){
            System.out.println("entered number is even");
        }
        else {
            System.out.println("entered number is odd");
        }
    }
}

//output
//enter the number: 57
//        entered number is odd