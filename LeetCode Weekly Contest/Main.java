package com.dileep;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(23+"dd");

        String s = 23+"dd";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

    }
}
