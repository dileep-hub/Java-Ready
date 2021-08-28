package com.dileep;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        pyth(a, b, c);
    }
    static void pyth(int num1, int num2, int num3)
    {
        if ( (num1*num1 + num2*num2 == num3*num3) || (num1*num1 + num3*num3 == num2*num2) || (num3*num3 + num2*num2 == num1*num1))
        {
            System.out.println("The are Pythagorean numbers");
        }
        else {
            System.out.println("They not Pythagorean numbers");
        }
    }
}

//output
//enter three numbers:
//        3 4 5
//        The are Pythagorean numbers
