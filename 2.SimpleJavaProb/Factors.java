package com.dileep.SimpleJava;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = in.nextInt();


        for (int i = 1; i<=n; i++)
        {
            if (n%i == 0)
            {
                System.out.print(i+ " ");
            }
        }

    }
}

//output
//
//        enter number: 10000
//        1 2 4 5 8 10 16 20 25 40 50 80 100 125 200 250 400 500 625 1000 1250 2000 2500 5000 10000