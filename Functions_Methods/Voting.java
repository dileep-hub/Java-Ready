package com.dileep;

import com.sun.source.tree.SynchronizedTree;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the age: ");
        int a = in.nextInt();
        voteOrnot(a);

    }
    static void voteOrnot(int age){
        if (age >= 18)
        {
            System.out.println("You can vote :)");
        }
        else {
            System.out.println("Sorry u cannot vote :( ");
        }
    }
}

//output
//enter the age:
//        3
//        Sorry u cannot vote :(