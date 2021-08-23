package com.dileep;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true)
        {
            System.out.print("enter an operator: ");
            char ch = in.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '%')
            {
                System.out.print("enter 2 numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
// ASLP WE CAN USE SWITCH
                if (ch == '+')
                {
                    ans = num1 + num2;
                }
                if (ch == '-')
                {
                    ans = num1 - num2;
                }
                if (ch == '*')
                {
                    ans = num1 * num2;
                }
                if (ch == '/')
                {
                    ans = num1 / num2;
                }
                if (ch == '%') {
                    ans = num1 % num2;
                }
            }
            else if (ch == 'x' || ch == 'X')
            {
                break;
            }
            else {
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }

    }
}

//output
//        enter an operator: -
//        enter 2 numbers: 3 4
//        -1
//        enter an operator: *
//        enter 2 numbers: 5 6
//        30
//        enter an operator: /
//        enter 2 numbers: 6 5
//        1
//        enter an operator: %
//        enter 2 numbers: 4 3
//        1
//        enter an operator: x
//
//        Process finished with exit code 0
