package com.dileep;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 2 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();

        int lcm = (a > b) ? a+1 : b+1;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM IS " + lcm);
                break;
            }
            lcm++;

        }

    }
}

//output
//enter 2 numbers :
//        72 120
//        LCM IS 360