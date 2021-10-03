package com.dileep;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = new String(in.nextLine());

        char[] c_arr = s.toCharArray();
        int count = 0;
        char[] c_arr2 = new char[c_arr.length];
//        System.out.println(c_arr[3]);
        for (int i= c_arr.length-1; i >= 0; i--)
        {
            c_arr2[count] = c_arr[i];
            count++;
        }
        System.out.println(c_arr2);

    }
}

//output

//    Enter a string: The dog is barking..
//        ..gnikrab si god ehT
//
//        Process finished with exit code 0