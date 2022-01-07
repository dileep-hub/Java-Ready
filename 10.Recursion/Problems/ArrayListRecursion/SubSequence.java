package com.dileep.Problems.ArrayListRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res  = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0) {
            ArrayList<String> farr = new ArrayList<>();
            farr.add("");
            return farr;
        }

        char ch = str.charAt(0);
        String r = str.substring(1);
        ArrayList<String> farr1 = gss(r);

        ArrayList<String> mres = new ArrayList<>();
        for(String s : farr1) {
            mres.add("" + s);
        }
        for (String s : farr1) {
            mres.add(ch + s);
        }

        return mres;

    }
}
