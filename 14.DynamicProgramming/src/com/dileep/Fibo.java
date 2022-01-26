package com.dileep;

public class Fibo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibo1(n));

        int n2 = 6;
        int[] arr = new int[n2+1];
        System.out.println(fibo2(n2, arr));

    }
    static int fibo1(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        return fibo1(n-1)+fibo1(n-2);
    }

    static int fibo2(int n, int[] check) {
        if(n == 0 || n == 1)  {
            return n;
        }

        if (check[n] != 0) {
            return check[n];
        }

        int a1 = fibo2(n-1, check);
        int a2 = fibo2(n-2, check);
        int ans = a1+a2;

        check[n] = ans;
        return ans;


    }
}
