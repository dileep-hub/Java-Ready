package com.dileep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello World!");
    for(int count=1; count != 2; count++)
    {
        System.out.println(count);
    }

        int a = 10;
        Scanner input = new Scanner(System.in);
        // this would take next integer
//        System.out.println(input.nextInt());
        System.out.print("Enter the number: ");
        a = input.nextInt();

        if (a <= 10)
        {
            System.out.println("Num is less than 10");
        }
        else
        {
            System.out.println("Number greater than 10");
        }
    }
}

//output
//
//        1
//        Enter the number: 93
//        Number greater than 10
