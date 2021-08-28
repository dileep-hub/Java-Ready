package com.dileep;

import java.util.Arrays;
import java.util.Scanner;

public class sum {

    //6 shadow
//    static int x = 12;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1 sum
//        int n = sum(1,4);
//        System.out.println(n);


        //2 swap
//        int a = 12;
//        int b = 13;
//        swap(a, b);
//        System.out.println(a + " " + b);
//        System.out.println(n1 + " " + n2);
        //3  String
//        String name = "dileep";
//        changename(name);
//        System.out.println(name);
//        // strings are immutable we cannot change them

        //4 change value inside the object using func
//        int[] arr = {1,2,3,4,5};
//        change(arr);
//        System.out.println(Arrays.toString(arr));
//        String s = Arrays.toString(arr);
//        System.out.println(s + " " + s.getClass().getSimpleName());
//        System.out.println(arr.getClass().getSimpleName());

        //5 scoping
//        int a = 12;
//        {
//            a = 13;
//            int b = 15;
//            System.out.println(b+ " b");
//        }
//        System.out.println(a);
//        int b = 19;
//        System.out.println(b  + " b");
//
//        for (int i = 0; i<5; i++){
//            a = a+4;
//        }
//        System.out.println("a after for loop " + a);

        // 6 shadow
//        System.out.println(x);
//        int x = 15; // outer x is overrided
//        System.out.println(x);
//
//        fun();

        //7 varArgs
//        var("ab", "dhd", "ddd");

        // 8
//        over1(12);
//        over1("ab");
//        over1(14, "bvn");

        // 9 Prime
//        System.out.println(isPrime(83));

        for (int i = 1000; i<10000; i++)
        {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        }
//1
//        static int sum(int a, int b) {
//            return a+b;

    //2
//        static void swap(int a, int b) // this is a new a,b values
//        {
//            int temp = a;
//            a = b;
//            b = temp;
//            System.out.println(a + " " + b);
//
//    }
// 3
//    static void changename(String naam)
//    {
//        naam = "kumar";
//    }

    //4
//    static void change(int [] nums)
//    {
//        nums[0] = 122;
//    }

    //6
//    static void fun(){
//        System.out.println(x);
//    }

    // 7
//    static void var(String ...v) // to take multiple args
//    {
//        System.out.println(Arrays.toString(v));
//    }

    // 8 method Overlaoding
//    static void over1(int a)
//    {
//        System.out.println(a);
//    }
//
//    static void over1(String  a)
//    {
//        System.out.println(a);
//    }
//    static void over1(int a, String b)
//    {
//        System.out.println(a + " " + b);
//    }

    // 9 prime
    static boolean isPrime(int n)
    {
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c <= n)
        {
           if(n%c == 0)
           {
               return false;
           }
           c++;
        }
        if (c*c > n)
        {
            return true;
        }
        else {
            return false;
        }
    }

    // print all 3 digit armstrong numbe
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0)
        {
            int rem = n%10;
            n = n/10;
            sum += rem * rem * rem * rem;
        }
        return sum == original;
    }


}




