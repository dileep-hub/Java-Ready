package com.dileep;

public class Primitive {
    public static void main(String[] args) {
        int a = 12;
        char c = 'd';
        float g = 12.22f;
        double d = 14.2222222222222222;
        boolean b = true;
        long l = 1111111111119292L;

        // bcoz float > int
        int m = (int)g;

        float n = a;
        System.out.println(m + " " + n);

    }
}

//output
// 12 12.0
