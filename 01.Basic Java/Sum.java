package com.dileep;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;
        System.out.println("Sum of "+ num1 + " and " + num2 + " is " + sum);

    }
}

// output

//        1 2 3
//        Sum of 1.0 and 2.0 is 3.0

