package com.dileep;

public class TypeCasting {
    public static void main(String[] args) {
        byte a1 = 12;
        int b1 = a1;
        System.out.println(b1);

        byte a2 = 40;
        byte b2 = 50;
        byte c2 = 100;
        // while doing operations byte converts into int
        int d2 = a2 * b2 / c2;
        System.out.println(d2);

        // java supports UTF-8
        System.out.println("你好");

        char c3 = 'g';
        int i3 = c3;
        System.out.println(i3);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        // here u can see char c also converted into int
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}

//output

//        12
//        20
//        你好
//        103
//        238.14 515 126.3616
//        626.7784146484375


