package com.dileep.Problems.ArrayListRecursion;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);

    }

    public static ArrayList<String> getStairPaths(int n) {

        if(n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if(n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> p1 = getStairPaths(n-1);
        ArrayList<String> p2 = getStairPaths(n-2);
        ArrayList<String> p3 = getStairPaths(n-3);

        ArrayList<String> fres = new ArrayList<>();

        for(String path : p1) {
            fres.add(1 + path);
        }
        for(String path : p2) {
            fres.add(2 + path);
        }
        for(String path : p3) {
            fres.add(3 + path);
        }

        return fres;

    }
}

//output
//        4
//        [1111, 112, 121, 13, 211, 22, 31]
