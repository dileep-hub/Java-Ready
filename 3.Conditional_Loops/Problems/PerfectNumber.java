package com.dileep;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int p = in.nextInt();
        int sum = 0;
        for (int i=1; i<p; i++)
        {
            if (p%i == 0)
            {
                sum += i;
            }
        }
        if (sum == p)
        {
            System.out.println("Perfect number");
        }
        else {
            System.out.println("Not a perfect number");
        }

    }
}

//output
//enter the number:
//        8128
//        Perfect number
