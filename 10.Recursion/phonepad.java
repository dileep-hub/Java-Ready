package com.dileep;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class phonepad {
    public static void main(String[] args) {

        pad("", "12");
        System.out.println(padret("", "12"));
        System.out.println(padcount("", "12"));

    }

    static int padcount(String p, String up) {
        if(up.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
            return 1;
        }
        int digit = up.charAt(0) - '0';
//        ArrayList<String> list = new ArrayList<>();
        int count = 0;

        for (int i= (digit-1) * 3; i<digit*3; i++) {
            char ch = (char) ('a' + i);
            count = count + (padcount(p + ch, up.substring(1)));
//            count = count + pa

        }
        return count;
    }

    static ArrayList<String> padret(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        for (int i= (digit-1) * 3; i<digit*3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padret(p + ch, up.substring(1)));

        }
        return list;
    }

    static void pad(String p, String up) {
        if( up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
//        System.out.println(digit);

        for (int i= (digit-1) * 3; i<digit*3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

}
