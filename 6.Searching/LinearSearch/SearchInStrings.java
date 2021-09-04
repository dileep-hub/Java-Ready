package com.dileep;

public class SearchInStrings {
    public static void main(String[] args) {
        String name  = "Dileep Kumar";
        char c = 'a';
        System.out.println(search(name, c));
    }
    static boolean search(String name, char c)
    {
        for (char ch : name.toCharArray())
        {
//            System.out.println((int) c + " " + (int) ch) ;
            if ((int)c == (int) ch || (int) c+32 == (int)ch || (int) c-32 == (int)ch) return true;
        }
        return false;
    }
}
