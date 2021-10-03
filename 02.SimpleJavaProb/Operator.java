package com.dileep.SimpleJava;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter 1st num: ");
        int num1 = in.nextInt();
        System.out.print("enter 2nd num: ");
        int num2 = in.nextInt();
        System.out.print("enter the operator: [+, *, /, -]");
        char c = in.next().charAt(0);

        switch (c)
        {
            case '+' :{
                System.out.println(num1 + num2);
                break;
            }
            case '-':
            {
                System.out.println(num1 - num2);
                break;
            }

            case '/':
            {
                System.out.println(num1 / num2);
                break;
            }
            case '*':
            {
                System.out.println(num1 * num2);
                break;
            }

        }



    }
}

//output
//        enter 1st num: 7
//        enter 2nd num: 8
//        enter the operator: [+, *, /, -]-
//        -1