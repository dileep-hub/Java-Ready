package com.dileep.SimpleJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter principle, time, Rate");
        int p = in.nextInt();
        int t = in.nextInt();
        int r = in.nextInt();
        System.out.println("Simple interest => " + (p*t*r)/100);
    }
}

//output
//        enter principle, time, Rate
//        10000
//        5
//        5
//        Simple interest => 2500
