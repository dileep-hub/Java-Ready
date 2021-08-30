package com.dileep;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // ArrayList<ArrayList<Integer>> is just a type
        // initislization
        for (int i=0; i<3 ; i++)
        {
            list.add(new ArrayList<>());
        }
        // adding elements
        for (int i=0; i<3; i++)
        {
            for(int j=0; j < 3; j++)
            {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
        System.out.println(list.getClass().getSimpleName());
        System.out.println(list.toArray()[1]);


    }
}

////output
//1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
//        ArrayList
//        [4, 5, 6]
