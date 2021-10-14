import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int[][] arr = new int[n][m];
    
    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            arr[i][j] = sc.nextInt();
        }
    }
    
    int c = 0;
    
    while(c < m) {
        for(int i=0; i<n; i++) {
            System.out.println(arr[i][c]);
        }
        c++;
        
        if(c < m) {
            for(int j=n-1; j>=0; j--) {
            System.out.println(arr[j][c]);
            }
            c++;
        }
    }
    
  // ONE MORE APPROACH 
  
//   for (int j = 0; j < arr[0].length; j++) {
//       if (j % 2 == 0) {
//         for (int i = 0; i < arr.length; i++)
//           System.out.println(arr[i][j]);
//       } else {
//         for (int i = arr.length - 1; i >= 0; i--)
//           System.out.println(arr[i][j]);
//       }
    
 }

}


// Sample Input
// 3
// 4
// 11
// 12
// 13
// 14
// 21
// 22
// 23
// 24
// 31
// 32
// 33
// 34
// Sample Output
// 11
// 21
// 31
// 32
// 22
// 12
// 13
// 23
// 33
// 34
// 24
// 14
