package com.dileep.Week281;

public class CountIntegersINEven {
    public static void main(String[] args) {

        int ans = countEven(30);
//        System.out.println("hel");
        System.out.println(ans);

    }

    public static int countEven(int num) {

        int count=0;
        int digit = 0;

        for (int i = 1; i <= num; i++) {
            digit = i;
            int sum = 0;
            while(digit > 0) {
                sum = sum + digit%10;
                digit = digit/10;
            } if(sum%2 == 0) {
                count++;
            }

        }
        return count;

    }

}
