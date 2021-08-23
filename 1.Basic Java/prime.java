package com.dileep;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = in.nextInt();

        if (n <= 1)
        {
            System.out.println("Its not a prime number");
        }
        int c = 2;
        while (c*c <= n)
        {
            if (n%c == 0)
            {
                System.out.println("Its not a prime number");
                return;
            }
            c++;
        }
        System.out.println("Its prime");

        // or
        // if (c*c > n)
        // {
        //     System.out.println("Its prime");
        // }

    }
}
