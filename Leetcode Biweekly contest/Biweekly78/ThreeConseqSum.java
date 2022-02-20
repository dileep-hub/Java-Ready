package com.dileep.Biweekly78;

import java.util.Arrays;

public class ThreeConseqSum {
    public static void main(String[] args) {

        int num = 25;
        long[] ans = sumOfThree(num);
        System.out.println(Arrays.toString(ans));


    }

    public static long[] sumOfThree(long num) {

        if (num%3 != 0) {
            return new long[0];
        }

        long[] ans = new long[3];
        long m = num/3;
        ans[0] = m-1;
        ans[1] = m;
        ans[2] = m+1;

        return ans;


//        for(long i=0; i<1000000000; i++) {
//            if(i + i+1 + i+2 == num) {
//                ans[0] = i;
//                ans[1] = i+1;
//                ans[2] = i+2;
//                return ans;
//            }
//        }
//
//        return ans;


    }

}
