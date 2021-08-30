package com.dileep;

import java.util.Scanner;

public class StudentsMarksGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter ur marks [0-100]: ");
        int m = in.nextInt();

        grade(m);

    }
    static void grade(int marks){
        if (100 >= marks && marks >= 91)
        {
            System.out.println("AA");
        }
        else if(90>= marks && marks >= 81)
        {
            System.out.println("AB");
        }
        else if(80>= marks && marks >= 71)
        {
            System.out.println("BB");
        }
        else if(70>= marks && marks >= 61)
        {
            System.out.println("BC");
        }
        else if(60>= marks && marks >= 51)
        {
            System.out.println("CD");
        }
        else if(50>= marks && marks >= 41)
        {
            System.out.println("DD");
        }
        else {
            System.out.println("Fail");
        }
    }
}

//output
//enter ur marks [0-100]: 99
//        AA
