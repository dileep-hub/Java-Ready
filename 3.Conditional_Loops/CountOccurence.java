package com.dileep;

public class CountOccurence {
    public static void main(String[] args) {
        int n = 122482882;
        int c = 2; // how many times c occurs
        int count = 0;

        while (n > 0)
        {
            if (n%10 == c)
            {
                count++;
            }
            n = n/10;
        }
        System.out.println(c + " occured " + count + " times.");
    }
}

//output
//
//        2 occured 4 times.