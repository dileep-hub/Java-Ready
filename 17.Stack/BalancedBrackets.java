package com.dileep;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if(ch == ')') {

                if (st.size() == 0) {
                    System.out.println(false);
                    return;
                } else if(st.peek() != '(') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }

            } else if(ch == '}') {

                if (st.size() == 0) {
                    System.out.println(false);
                    return;
                } else if(st.peek() != '{') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }

            } else if(ch == ']') {
                if (st.size() == 0) {
                    System.out.println(false);
                    return;
                } else if(st.peek() != '[') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }

            }
        }
//        System.out.println(true);

        if(st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }



}
