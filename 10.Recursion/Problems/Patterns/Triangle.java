package com.dileep.Problems.Patterns;

public class Triangle {
    public static void main(String[] args) {
        tri1(4,0);
        System.out.println();
//        tri2(4,0);

        tri3(5, 0);
        System.out.println();
        tri4(5, 0);
    }

    static void tri1(int n, int m) {
        if(n==0) {
            return;
        }
        if(n > m) {
            System.out.print("* ");
            tri1(n, m+1);
        } else {
            System.out.println();
            tri1(n-1, 0);
        }
    }

    static void tri2(int n, int m) {
        if(n==0) {
            return;
        }
        if(n > m) {
            tri2(n, m+1);
            System.out.print("* ");
        } else {
            tri2(n-1, 0);
            System.out.println();
        }
    }

    static void tri3(int r, int c) {
        if(r == 0)  {
            return;
        }
        else if(r > c)  {
            System.out.print("* ");
            tri3(r, c+1);
        } else {
            System.out.println();
            tri3(r-1, 0);
        }
    }

    static void tri4(int r, int c) {
        if(r == 0)  {
            return;
        }
        else if(r > c)  {
//            System.out.print("* ");
            tri4(r, c+1);
            System.out.print("* ");
        } else {

            tri4(r-1, 0);
            System.out.println();
        }
    }

}
