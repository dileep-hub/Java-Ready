package com.dileep;
import java.util.Scanner;

public class NCR {
    static int nCr(int i, int j) {
        return fact(i) / (fact(j) * fact(i - j));
    }

    static int fact(int k) {
        int f = 1;
        while (k != 0) {
            f = f*k;
            k -= 1;
        }
        return f;
    }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("enter value of n and c : ");
            int n = in.nextInt();
            int r = in.nextInt();
            System.out.println(nCr(n, r));
        }
    }


    //output
//    enter value of n and c : 5 2
//        10
