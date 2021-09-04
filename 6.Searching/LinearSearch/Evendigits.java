package com.dileep;

public class Evendigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896, 40, 94, 344433, 3,4};
        int ans = findEvendigts(nums);
        System.out.println(ans);
    }
    static int findEvendigts(int[] arr)
    {
        int count = 0;
        for (int num : arr)
        {
            if (even(num))
            {
                count++;
            }
        }
        return  count;
    }

    static boolean even(int n)
    {
        int d = noOfDigit(n);
        if (d%2 == 0)
        {
            return true;
        }
        else return false;
    }

    static int noOfDigit(int k)
    {
        int j = (int) Math.log10(k);
        return j+1;
    }

}
