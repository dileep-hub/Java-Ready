package com.dileep;

import java.lang.reflect.Array;
import java.util.Arrays;

class FlipingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},
                         {1,0,1},
                         {0,0,0}};
        flipAndInvertImage(image);
        for(int[] r : image) {
            System.out.println(Arrays.toString(r));
        }
    }
    static void flipAndInvertImage(int[][] image) {
        for(int[] row : image) {
            int len = row.length-1;
            for(int i=0; i<(row.length+1)/2; i++) {
                int temp = row[i] ^ 1;           // it flipped nd also inverted it
                row[i] = row[len-i] ^ 1;
                row[len-i] = temp;
            }
        }
    }
}


//output
//        [1, 0, 0]
//        [0, 1, 0]
//        [1, 1, 1]