package com.dileep;

import java.util.Scanner;

public class Weekend {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

//        switch (day)
//        {
//            case 1: {
//                System.out.println("Monday");
//                break;
//            }
//            case 2: {
//                System.out.println("Tuesday");
//                break;
//            }
//            case 3: {
//                System.out.println("Wednesday");
//                break;
//            }
//            case 4: {
//                System.out.println("Thursday");
//                break;
//            }
//            case 5: {
//                System.out.println("Friday");
//                break;
//            }
//            case 6: {
//                System.out.println("Saturday");
//                break;
//            }
//            case 7: {
//                System.out.println("Sunday");
//            }
//        }

        switch (day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            {
                System.out.println("WeekDay");
                break;
            }
            case 6:
            case 7:
            {
                System.out.println("Weekend");
            }
            default: {
                System.out.println("Only [1,2,3,4,5,6,7] are allowed");
            }
        }


    }
}
