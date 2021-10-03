package com.dileep;

import java.util.Scanner;

public class DiscountProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter total price and discount(in %) : ");
        int total = in.nextInt();
        int dis = in.nextInt();

        int disAmount = (total * dis)/100;
        int amountPay = total - disAmount;
        System.out.println("The final amount is " + amountPay + ". Amount discount is " + disAmount);



    }
}

// output
//enter total price and discount(in %) : 16000 30
//        The final amount is 11200. Amount discount is 4800