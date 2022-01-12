package com.dileep.Problems.RecursionWayUP;

import java.util.Scanner;

public class PrintKPC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printKPC(str, "");

    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    // asf  ==> ans
    public static void printKPC(String str, String asf) {

        if(str.length() == 0) {
            System.out.println(asf);
            return;
        }

//        chn = num
        char chn = str.charAt(0);
        String rstr = str.substring(1);

        String codesi = codes[chn-'0'];
        for(int i=0; i<codesi.length(); i++) {
            printKPC(rstr, asf+ codesi.charAt(i));
        }


    }

}
