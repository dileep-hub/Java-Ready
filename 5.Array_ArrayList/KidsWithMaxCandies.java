package com.dileep;

import java.util.ArrayList;
import java.util.List;

public class KidsWithMaxCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        List<Boolean> res = new ArrayList<Boolean>(candies.length);
        // List<Boolean> list=new ArrayList<Boolean>(Arrays.asList(new Boolean[10]));
        for(int i=0; i<candies.length; i++)
        {
            if (candies[i] > max)
            {
                max = candies[i];
            }
        }

        for (int i=0; i<candies.length; i++)
        {
            if (candies[i] + extraCandies >= max)
            {
                res.add(true);
            }
            else
            {
                res.add(false);
            }
        }
        return res;

    }
}
