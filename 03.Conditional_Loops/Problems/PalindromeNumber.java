package com.dileep;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int pal = in.nextInt();
        int pal1 = pal;
        int ans = 0;

        while (pal > 0)
        {
            ans =  ans * 10 + pal%10;
            pal = pal/10;
        }
        if (pal1 == ans)
        {
            System.out.println("Its Palindrome number");
        }
        else {
            System.out.println("not a palindrome number");
        }


    }
}


//output
//enter the number: 100000001
//        Its Palindrome number
