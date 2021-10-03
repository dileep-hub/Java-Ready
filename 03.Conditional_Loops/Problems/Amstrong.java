package com.dileep;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();
        int num1 = num;
        int num2 = num;
        int digit = 0;
        while (num1 > 0)
        {
            num1 = num1/10;
            digit++;
        }

        int ams = 0;
        int p =0;
        while (num2 > 0)
        {
            p = num2%10;
            ams += Math.pow(p, digit);
            num2 = num2/10;

        }
        if (ams == num)
        {
            System.out.println(num + " is a Amstrong number");
        }
        else
        {
            System.out.println("Not an Amstrong number");
        }

    }
}

//output
//enter the number: 8208
//        8208 is a Amstrong number
//
//        Process finished with exit code 0