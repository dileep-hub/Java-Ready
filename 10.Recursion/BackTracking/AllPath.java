package com.dileep.BackTracking;

import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {

        boolean[][] b = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        pathAll("", b, 0, 0);

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        pathAllprint("", board, 0, 0, path, 1);


    }

    static void pathAll(String p,boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1 ) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if(r < maze.length-1  ) {
            pathAll(p + "D", maze,  r+1, c);
        }
        if(c < maze[0].length-1  ) {
            pathAll(p + "R",maze,  r, c+1);
        }
        if(r > 0) {
            pathAll(p + "U", maze, r-1, c);
        }
        if(c > 0) {
            pathAll(p + "L", maze, r, c-1);
        }

        maze[r][c] = true;

    }

    static void pathAllprint(String p,boolean[][] maze, int r, int c, int[][] path, int step) {

        if(r == maze.length-1 && c == maze[0].length-1 ) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1  ) {
            pathAllprint(p + "D", maze,  r+1, c, path, step+1);
        }
        if(c < maze[0].length-1  ) {
            pathAllprint(p + "R",maze,  r, c+1, path, step+1);
        }
        if(r > 0) {
            pathAllprint(p + "U", maze, r-1, c, path, step+1);
        }
        if(c > 0) {
            pathAllprint(p + "L", maze, r, c-1, path, step+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;

    }

}


//"C:\Program Files\Java\jdk1.8.0_311\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=54271:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_311\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\rt.jar;D:\Java_Bootcamp_2021\Recursion\out\production\Recursion" com.dileep.BackTracking.AllPath
//        DDRR
//        DDRURD
//        DDRUURDD
//        DRDR
//        DRRD
//        DRURDD
//        RDDR
//        RDRD
//        RDLDRR
//        RRDD
//        RRDLDR
//        RRDLLDRR
//        [1, 0, 0]
//        [2, 0, 0]
//        [3, 4, 5]
//        DDRR
//
//        [1, 0, 0]
//        [2, 5, 6]
//        [3, 4, 7]
//        DDRURD
//
//        [1, 6, 7]
//        [2, 5, 8]
//        [3, 4, 9]
//        DDRUURDD
//
//        [1, 0, 0]
//        [2, 3, 0]
//        [0, 4, 5]
//        DRDR
//
//        [1, 0, 0]
//        [2, 3, 4]
//        [0, 0, 5]
//        DRRD
//
//        [1, 4, 5]
//        [2, 3, 6]
//        [0, 0, 7]
//        DRURDD
//
//        [1, 2, 0]
//        [0, 3, 0]
//        [0, 4, 5]
//        RDDR
//
//        [1, 2, 0]
//        [0, 3, 4]
//        [0, 0, 5]
//        RDRD
//
//        [1, 2, 0]
//        [4, 3, 0]
//        [5, 6, 7]
//        RDLDRR
//
//        [1, 2, 3]
//        [0, 0, 4]
//        [0, 0, 5]
//        RRDD
//
//        [1, 2, 3]
//        [0, 5, 4]
//        [0, 6, 7]
//        RRDLDR
//
//        [1, 2, 3]
//        [6, 5, 4]
//        [7, 8, 9]
//        RRDLLDRR
//
//
//        Process finished with exit code 0
