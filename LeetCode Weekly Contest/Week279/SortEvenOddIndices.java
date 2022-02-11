package com.dileep.Week279;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;

import java.util.Collections;
import java.util.PriorityQueue;

public class SortEvenOddIndices {

    public static void main(String[] args) {
        int[] nums = {4,1,2,3};
        int[] ans = sortEvenOdd(nums);
        for(int ele : ans) {
            System.out.print(ele  + " ");
        }
    }

    public static int[] sortEvenOdd(int[] nums) {

        PriorityQueue<Integer> pqeven = new PriorityQueue<>();
        PriorityQueue<Integer> pqodd = new PriorityQueue<>(Collections.reverseOrder());


        for (int i = 0; i < nums.length; i++) {
            if(i%2 == 0) {
                pqeven.add(nums[i]);
            } else {
                pqodd.add(nums[i]);
            }
        }

        for(int i=0; i<nums.length; i++) {
            if(i%2 == 0) {
                nums[i] = pqeven.remove();
            } else {
                nums[i] = pqodd.remove();
            }
        }

        return nums;

    }

}


//output
//2 3 4 1 