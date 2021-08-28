package com.dileep;

import java.util.Scanner;

public class PrimeBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        prime(a,b);

    }
    static void prime(int n, int m)
    {
        for (int i = n; i <= m ; i++)
        {
            if (isprime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        if (c * c > n) {
            return true;
        }
        else {
            return false;
        }
    }

}


// output
//enter two numbers:
//        1 20
//        2 3 5 7 11 13 17 19



