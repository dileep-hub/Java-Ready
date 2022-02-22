package com.dileep;

import sun.awt.AWTAccessor;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        boolean b = false;

        for(int i=0; i<str.length(); i++) {

            if(str.charAt(i) == ')') {

                if (st.peek() == '(') {
//                    System.out.println("true");
                    b = true;
                    break;
                }

                while(st.peek() != '(') {
                    st.pop();
                }
                st.pop();
            } else  {
                st.push(str.charAt(i));
            }

        }

        System.out.println(b);

    }

}

//output
//((a+s)+(s+dS))
//        false

