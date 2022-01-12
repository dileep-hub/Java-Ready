package com.dileep.Problems.RecursionWayUP;

import java.util.Scanner;

public class PrintSubSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSS(str, "");

    }

    public static void printSS(String str, String ans) {

        if(str.length() == 0 ) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String sstr = str.substring(1);

        printSS(sstr, ans + ch);
        printSS(sstr, ans + "");


    }

}
