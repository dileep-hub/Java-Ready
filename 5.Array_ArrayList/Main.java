package com.dileep;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        // 1D array
//        // datatype[] var_name = new datatype[size];
//        int[] arr1 = new int[5];
//        int[] arr2 = {1,2,3,4,5,6,7};
////      int[] arr3; // declaration not initialzation
//
//        String[] str1 = new String[5];
//        str1[0] = "dileep";
//        str1[3] = "kumar";
//
//        System.out.println(arr1[2]);// default val = 0
//        System.out.println(str1[0] + " " + str1[1] + " " + str1[3]); // default value = null
//
//

        //LeetCode

        int arr1[] = {1,2,3};
        Concatination c = new Concatination();
        int[] arr2 = c.getConcatenation(arr1);
        System.out.println(Arrays.toString(arr2));

        int arr4[] = {1,2,0,4,3};
        ArrayPermutation a = new ArrayPermutation();
        int[] arr3 = a.buildArray(arr4);
        System.out.println(Arrays.toString(arr3));

        int [] arr5 = {1,2,3,4,5,6};
        RunningArraySum r = new RunningArraySum();
        int [] arr6 = r.runningSum(arr5);
        System.out.println(Arrays.toString(arr6));

        int[][] accounts1 = {{1,2,3},{3,2,1},{4,5,2,3}};
        RichestCustomerWealth r1 = new RichestCustomerWealth();
        int accounts2 = r1.maximumWealth(accounts1);
        System.out.println(accounts2);

        int[] arr7 = {1,2,3,4,4,3,2,1};
        int n = 4;
        ShuffleArray s = new ShuffleArray();
        int[] n1 = s.shuffle(arr7, n);
        System.out.println(Arrays.toString(n1));

        int [] candies = {3,4,1,2,5};
        int extraCandies = 3;
        KidsWithMaxCandies k = new KidsWithMaxCandies();
        System.out.println(k.kidsWithCandies(candies, extraCandies));


        int[] nums1 = {1,2,3,1,1,3};
        NumberofGoodPairs ng = new NumberofGoodPairs();
        System.out.println(ng.numIdenticalPairs(nums1));

        String str1 = "thequickbrownfoxjumpsoverthelazydog";
        Pangram p = new Pangram();
        System.out.println(p.checkIfPangram(str1));

    }
}
