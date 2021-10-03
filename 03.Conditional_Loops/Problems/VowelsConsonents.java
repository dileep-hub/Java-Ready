package com.dileep;

import java.util.Scanner;

public class VowelsConsonents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the char: ");
        char c = in.next().trim().charAt(0);

        switch (c)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U': {
                System.out.println(" its a vowel");
                break;
            }
            default:
            {
                System.out.println("consonant");
            }
        }

//output
//        enter the char:
//        I
//        its a vowel


    }
}
