package com.dileep.SubsetSequence;

public class skipStr {
    public static void main(String[] args) {
        String st = "kkkapplekaaapplejjappjdappapple";
        String k = skip(st);
        System.out.println(k);
    }

    static String skip(String str) {
        if(str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if(str.startsWith("app") && !(str.startsWith("apple"))) {
            return skip(str.substring(3));
        }
        else  {
            return ch + skip(str.substring(1));
        }
    }
}
