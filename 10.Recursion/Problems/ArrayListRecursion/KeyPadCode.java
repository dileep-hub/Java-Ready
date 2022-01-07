package com.dileep.Problems.ArrayListRecursion;

import java.awt.geom.Area;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class KeyPadCode {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);

    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx",
            "yz"};

    public static ArrayList<String> getKPC(String str) {

        if(str.length() == 0) {
            ArrayList<String> bas = new ArrayList<>();
            bas.add("");
            return bas;
        }

        char ch = str.charAt(0);
        ArrayList<String> arr1 = getKPC(str.substring(1));

        ArrayList<String> arr2 = new ArrayList<>();

        String s = codes[ch - '0'];
        for(int i=0; i<s.length(); i++) {
            char chr = s.charAt(i);
            for(String val : arr1) {
                arr2.add(chr + val);
            }
        }

        return arr2;

    }

}

//
//output
//        789
//        [tvy, tvz, twy, twz, txy, txz, uvy, uvz, uwy, uwz, uxy, uxz]
