package com.dileep.BackTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Maze1 {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("", 3,3);
        System.out.println(pathret("", 3, 3));
        pathdiagonal("", 3, 3);

        System.out.println();
        System.out.println("Path Obstacle --> ");



        boolean[][] b = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathObstacle("", b, 0, 0);


    }

    static int count(int n, int m) {
        if(m == 1 || n == 1) {
            return 1;
        }

        int left = count(n-1, m);
        int right = count(n, m-1);
        return left + right;
    }

    static void path(String p, int n, int m) {
        if(n == 1 && m == 1) {
            System.out.println(p);
            return;
        }

        if(n != 1) {
            path(p + "D", n-1, m);
        }
        if(m != 1) {
            path(p + "R", n, m-1);
        }

    }

    static void pathdiagonal(String p, int n, int m) {
        if(n == 1 && m == 1) {
            System.out.println(p);
            return;
        }

        if(n != 1) {
            pathdiagonal(p + "V", n-1, m);
        }
        if(m != 1) {
            pathdiagonal(p + "H", n, m-1);
        }
        if(n >  1 && m > 1) {
            pathdiagonal(p + "D", n-1, m-1);
        }

    }

    static ArrayList<String> pathret(String p, int n, int m) {
        if(n == 1 && m == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(n != 1) {
            list.addAll(pathret(p + "D", n-1, m));
        }
        if(m != 1) {
            list.addAll(pathret(p + "R", n, m-1));
        }

        return list;

    }


    static void pathObstacle(String p,boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1 ) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if(r < maze.length-1  ) {
            pathObstacle(p + "D", maze,  r+1, c);
        }
        if(c < maze[0].length-1  ) {
            pathObstacle(p + "R",maze,  r, c+1);
        }
    }
}


//output

//6
//        DDRR
//        DRDR
//        DRRD
//        RDDR
//        RDRD
//        RRDD
//        [DDRR, DRDR, DRRD, RDDR, RDRD, RRDD]
//VVHH
//        VHVH
//    VHHV
//            VHD
//    VDH
//            HVVH
//    HVHV
//            HVD
//    HHVV
//            HDV
//    DVH
//            DHV
//DD
//
//        Process finished with exit code 0
