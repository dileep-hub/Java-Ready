package com.dileep;

import java.util.HashMap;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {

        String s = "aabracbbbbbbbbbbbbbbbbbbbadabra";

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(hm.containsKey(ch)) {
                int n = hm.get(ch);
                hm.put(ch, n+1);
            } else {
                hm.put(ch, 1);
            }
        }

        // highest freq char
        char hfCh = s.charAt(0);

        for(Character c : hm.keySet()) {
            if(hm.get(c) > hm.get(hfCh)) {
                hfCh = c;
            }
        }

        System.out.println(hfCh);

    }

}

//output
//b