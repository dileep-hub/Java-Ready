package com.dileep.Permutations;

import java.util.ArrayList;

public class perm {
    static  int count =0;
    public static void main(String[] args) {
//         count = 0;
        permutations("", "abc");
        ArrayList<String>  anss = permutations2("", "abc");
        System.out.println(anss);
        System.out.println(count);
    }

    // p => processed
    // up => unprocessed
    static void permutations(String p , String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }

    }

    static ArrayList<String> permutations2(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            count++;
            return list;
         }

        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i=0; i<=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutations2(f + ch + s, up.substring(1)));
        }

        return ans;

    }


}

//    cba
//            bca
//    bac
//            cab
//    acb
//            abc
//[cba, bca, bac, cab, acb, abc]