package com.dileep;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the year: ");
        int year = in.nextInt();

        boolean leap = false;

        if (year%4 == 0 )
        {
            if(year%100 == 0)
            {
                if (year%400 == 0)
                {
                    leap = true;
                }
                else {
                    leap = false;
                }
            }
            else {
                leap = true;
            }
        }

        else {
            leap = false;
        }
        System.out.println("Its is a leap year :  " + leap);

    }
}

//output
//enter the year:
//        1900
//        Its is a leap year :  false
//
