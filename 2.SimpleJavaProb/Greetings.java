package com.dileep.SimpleJava;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
//        String name = new String(in.nextLine());
        var name = in.nextLine();
        System.out.println("Good Morning "+ name);
    }
}
