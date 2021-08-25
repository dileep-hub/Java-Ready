package com.dileep;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 2 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();

        int hFact =  0;

        for ( int i = 1; i <= a && i <= b; i++)
        {
            if (a%i == 0 && b%i == 0) {
                hFact = i;
            }
        }
        System.out.println("Hfact is " + hFact);




    }
}


//output
//enter 2 numbers :
//        36 60
//        Hfact is 12