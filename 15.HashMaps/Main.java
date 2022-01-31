package com.dileep;

import com.sun.jmx.remote.internal.ClientListenerInfo;

import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 1);
        hm.put("US", 2);
        hm.put("canada", 3);

        System.out.println(hm);

        hm.put("india", 10);
        System.out.println(hm);

        System.out.println(hm.get("india"));
        System.out.println(hm.get("london"));

        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("london"));

        Set<String> keys = hm.keySet();
        System.out.println(keys);

    }
}

//output
//
//        {canada=3, india=1, US=2}
//        {canada=3, india=10, US=2}
//        10
//        null
//        true
//        false
//        [canada, india, US]