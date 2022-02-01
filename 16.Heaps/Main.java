package com.dileep;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // by default priority will be from smallest number
        int[] arr = {2,4,1,7,22,9,5};

        for(int val : arr) {
            pq.add(val);
        }

        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }

        // output for this
//        1
//        2
//        4
//        5
//        7
//        9
//        22

        PriorityQueue<Integer> pqr = new PriorityQueue<>(Collections.reverseOrder()) ;

        for(int val : arr) {
            pqr.add(val);
        }

        while (pqr.size() > 0) {
            System.out.println(pqr.remove());
        }

        //output for this : will be in reverse order
//        22
//        9
//        7
//        5
//        4
//        2
//        1


    }
}
