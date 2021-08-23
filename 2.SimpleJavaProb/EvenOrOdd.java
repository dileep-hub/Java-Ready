package com.dileep.SimpleJava;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        if (n%2 == 0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
