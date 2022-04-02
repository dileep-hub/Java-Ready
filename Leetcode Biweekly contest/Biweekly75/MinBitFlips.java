package com.dileep.Biweekly75;

public class MinBitFlips {

    public static void main(String[] args) {
//        String  c = Integer.toBinaryString(10);

        System.out.println(minBitFlips( 99,
                29));


    }


    public static int minBitFlips(int start, int goal) {

        String s1 = Integer.toBinaryString(start);
        String s2 = Integer.toBinaryString(goal);
        int ans = 0;

        while (s1.length() > s2.length()) {
            s2 = "0" + s2;
        }
        while (s2.length() > s1.length()) {
            s1 = "0" + s1;
        }

        System.out.println(s1.length());;
        System.out.println(s2.length());

        for(int i=0;i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                ans++;
            }
        }

        return ans;
    }

}
