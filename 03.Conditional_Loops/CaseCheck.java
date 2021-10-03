package com.dileep;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
//        System.out.println((int)ch);  => 97 for a
        if (ch >= 'a' && ch <= 'z' ) // while using operations even char convert into int
        {
            System.out.println("Lower case");
        }
        else
        {
            System.out.println("Upper case");
        }
    }
}

//output
//F
//        Upper case
//f
//        Lower case