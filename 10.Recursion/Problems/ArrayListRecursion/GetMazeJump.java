package com.dileep.Problems.ArrayListRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazeJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        ArrayList allPaths = getMazePaths(1,1, n1, n2);
        System.out.println(allPaths);

    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        // horizontal
        for(int h=1; h<=dc-sc; h++) {
            ArrayList<String> hpaths = getMazePaths(sr, sc+h, dr, dc);
            for(String hpath : hpaths) {
                paths.add("h" + h + hpath);
            }
        }

        //vertical
        for(int v=1; v<=dr-sr; v++) {
            ArrayList<String> vpaths = getMazePaths(sr+v, sc, dr, dc);
            for(String vpath : vpaths) {
                paths.add("v" + v + vpath);
            }
        }

        //diagnol
        for (int dms = 1; dms <= dr - sr && dms <= dc - sc; dms++)
        {
            ArrayList< String> dpaths = getMazePaths(sr + dms, sc + dms, dr, dc);

            for (String dpath : dpaths)    {
                paths.add("d" + dms + dpath);
            }
        }
        return paths;

    }



}
