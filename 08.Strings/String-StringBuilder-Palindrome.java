package com.dileep;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // String are immutable they cannot be changed
        // For mutability use Stringbuilder

        // objects created in String Loop
        String fname = "dileep";
        String lname = "kumar";
        String hname = "dileep";

        // use new to create new object
        String sname = new String("dileep");

        // println uses .value .toString before printing

        System.out.println(fname == hname); // same reference
        System.out.println(fname.equals(hname)); // checks value

        System.out.println(fname == sname);  // new reference
        System.out.println(fname.equals(sname)); // checks value
        System.out.println(fname + " " + lname);

        // use printf while using placeholder
        float a = 443.4373f;
        System.out.printf("Only two nums after decimal: %.2f", a);
        System.out.println();
        System.out.printf("Hello i am %s", "dileep");

        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("             String  Concatenation                  ");

        System.out.println('a' + 'b');
        System.out.println('a' + "b");
        System.out.println("a" + "b");

        // if we use char with operator it convert into numbers
        System.out.println("a"+ 12);
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));

        // Method Overriding
        // println(.value .toString)
        // After override => (Arrays.toString)
        System.out.println("dileep" + Arrays.toString(new int[] {1,2,3}));

        // StringBuilder
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("             String Builder                          ");

        // SB helps us to edit the string or appending, deleting so it is mutable
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.reverse());
        System.out.println(builder.replace(0, 4, "d"));

        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("             String Methods                          ");

        String n = "   Hello guys how are you  ";
        System.out.println(n.toLowerCase(Locale.ROOT));
        System.out.println(n.strip());
        System.out.println(Arrays.toString(n.split(" ")));
        // split convert it into array

        // Palindrome
        String p = new String("abcdcba");

        for (int i = 0; i < p.length()/2; i++) {
            char start = p.charAt(i);
            char end = p.charAt(p.length()-1-i);
            if(start != end) System.out.println("Not Palindrome");
        } System.out.println("Palindrome");
	}
}

//output
//        true
//        true
//        false
//        true
//        dileep kumar
//        Only two nums after decimal: 443.44
//        Hello i am dileep
//
//        -----------------------------------------------------
//        String  Concatenation
//        195
//        ab
//        ab
//        a12
//        100
//        d
//        dileep[1, 2, 3]
//
//
//        -----------------------------------------------------
//        String Builder
//        abcdefghijklmnopqrstuvwxyz
//        zyxwvutsrqponmlkjihgfedcba
//        dvutsrqponmlkjihgfedcba
//
//
//        -----------------------------------------------------
//        String Methods
//        hello guys how are you
//        Hello guys how are you
//        [, , , Hello, guys, how, are, you]
//        Palindrome
//
//        Process finished with exit code 0
