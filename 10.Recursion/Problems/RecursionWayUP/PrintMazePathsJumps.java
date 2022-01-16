package com.dileep.Problems.RecursionWayUP;

import java.util.Scanner;

public class PrintMazePathsJumps {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1,1,n,m,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        if(sc < dc) {
            int colLimit = dc - sc;
            for (int i = 1; i <= colLimit; i++) {
                printMazePaths(sr, sc + i, dr, dc, psf + "h" + i);
            }
        }

        if(sr < dr) {
            int rowLimit = dr-sr;
            for(int i=1; i<=rowLimit; i++) {
                printMazePaths(sr+i, sc, dr, dc, psf + "v" + i);
            }
        }

        if(sr<dr && sc<dc) {
            int dLimit = dr-sr;
            for(int i=1; i<=dLimit; i++) {
                printMazePaths(sr+i, sc+i, dr, dc, psf + "d" + i);
            }
        }

    }
}
