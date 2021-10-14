import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc = new Scanner(System.in);
     
    int n1 = sc.nextInt();
    int m1 = sc.nextInt();
    
    int[][] arr1 = new int[n1][m1];
    
    for(int i=0; i<n1; i++) {
        for(int j=0; j<m1; j++) {
            arr1[i][j] = sc.nextInt();
        }
    }
    
    int n2 = sc.nextInt();
    int m2 = sc.nextInt();
    
    int[][] arr2 = new int[n2][m2];
    
    for(int i=0; i<n2; i++) {
        for(int j=0; j<m2; j++) {
            arr2[i][j] = sc.nextInt();
        }
    }
    
    if (m1 != n2) {
      System.out.print("Invalid input");              //3
      return;
    }
    
    int n3 = n1;
    int m3 = m2;
    int[][] mul = new int[n3][m3];
    
    for(int i=0; i<n3; i++){
        for(int j=0; j<m3; j++) {
            int sum = 0;
            for(int k=0; k<m1; k++) {
                sum += arr1[i][k] * arr2[k][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}

}

//input
2
3
10
0
0
0
20
0
3
4
1
0
1
0
0
1
1
2
1
1
0
0
//output
10 0 10 0
0 20 20 40
