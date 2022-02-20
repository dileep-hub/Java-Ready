package com.dileep.Biweekly78;

import java.util.ArrayList;
import java.util.List;

public class MaxSplitPosNums {
    public static void main(String[] args) {

        int q = 28;
        List<Long> ans = maximumEvenSplit(q);
        System.out.println(ans);

    }

    public static List<Long> maximumEvenSplit(long finalSum) {

        List<Long> ans = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return ans;
        }

//        long a = 0;
//        for(long i=2; i<1000000000; i=i+2) {
//            if(a+i <= finalSum && a+i > finalSum-a+i ) {
//                ans.add(i);
//                a = a+i;
//            }
//            else if(a+i <= finalSum && finalSum - a+i <= a+i){
//                ans.add()
//            } else if(a == finalSum) {
//                return ans;
//            }
//        }

        long dupfin = finalSum;

        long a = 0;
        for (long i = 2; i < 1000000000; i+=2) {
            if (i < dupfin - i) {
                dupfin = dupfin - i;
                ans.add(i);
                a = a + i;
            } else if (i >= dupfin - i) {
                ans.add(dupfin);
                a = a + dupfin;
                return ans;
//            } else if(a == finalSum) {
//                return ans;
//            }
            }

            return ans;


        }
        return ans;
    }

}

