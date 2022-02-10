package com.dileep.Week279;

import java.util.Arrays;

public class SmallestValueAtRearranged {
    public static void main(String[] args) {

        long ans = smallestNumber(310);
        System.out.println(ans);

    }
    static long smallestNumber(long num) {

        boolean isNegative = num<0;

        num = Math.abs(num);

        char[] charArray = ("" + num).toCharArray();

        long ans = 0;

        Arrays.sort(charArray);

        if(isNegative) {
            String ansStr = "";
            for(int i=charArray.length-1; i>=0; i--) {
                ansStr += charArray[i];
            }
            ans = - Long.parseLong(ansStr);
        }
        else {
            int i=0;
            for(i=0; i<charArray.length; i++) {
                if(charArray[i] != '0') {
                    break;
                }
            }

            // swap 0 with non zero
            if(i <= charArray.length-1 ) {
                char temp  = charArray[i];
                charArray[i] = charArray[0];
                charArray[0] = temp;
            }

            String res = String.valueOf(charArray);
            ans = Long.parseLong(res);

        }


        return ans;

    }

}
