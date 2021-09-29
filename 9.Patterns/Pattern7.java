package com.dileep;

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(4);

    }
    static void pattern7(int n) {
        for (int i=0; i<2*n; i++) {
            int space = i>= n ? i-4+1 : n-i-1;
            for( int j=0; j<space; j++) {
                System.out.print(" ");
            }
            int num = i>=n ? (2*n)-i-1 : i+1;
            for(int k=num; k>=1; k--) {
                System.out.print(k);
            }
            for(int m=2; m<=num; m++) {
                System.out.print(m );
            }
            System.out.println();
        }
    }

}

//output
//              1
//             212
//            32123
//           4321234
//            32123
//             212
//              1