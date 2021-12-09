package com.dileep.SubsetSequence;

public class removeA {
    public static void main(String[] args) {
        String s = "haael alo a haaaia  a";
        skip1("", s);
        String k = skip2(s);
        System.out.println(k);
    }

    static void skip1(String f, String str) {
        if(str.isEmpty()) {
            System.out.println(f);
            return;
        }

        char ch = str.charAt(0);
        if(ch == 'a') {
            skip1(f, str.substring(1));
        } else {
            skip1(f + ch, str.substring(1));
        }

    }

    static String skip2(String str) {
        if(str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if(ch == 'a') {
            return skip2(str.substring(1));
        } else {
            return ch + skip2(str.substring(1));
        }

    }

}
