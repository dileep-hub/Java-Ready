package com.dileep.Problems.ArrayListRecursion;

import com.sun.javafx.geom.ShapePair;
import com.sun.rowset.internal.SyncResolverImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        ArrayList<String> allPaths = getMazePaths(1,1, n1, n2);
        System.out.println(allPaths);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();

        if(sc < dc) {
            hpath = getMazePaths(sr, sc+1, dr, dc);
        }
        if(sr < dr) {
            vpath = getMazePaths(sr+1, sc, dr,dc);
        }


        ArrayList<String> fpath = new ArrayList<>();

        for(String h : hpath) {
            fpath.add("h" + h);
        }

        for (String v : vpath) {
            fpath.add("v" + v);
        }

        return fpath;



//        ArrayList<String> hpath = getMazePaths(sr, sc+1, dr, dc);
//        ArrayList<String> vpath = getMazePaths(sr+1)

    }
}
