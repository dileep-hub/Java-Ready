package com.dileep;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack<Integer> s = new Stack<>();
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);

        System.out.println(s);

        s.pop();
        System.out.println(s);

        System.out.println(s.peek() + " " + s.size());

    }
}
