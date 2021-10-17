import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++) {
            
            int minv = 0;
            for(int j=1; j<n; j++) {
                if(arr[i][j] < arr[i][minv]) {
                    minv = j;
                }
            }
            
            boolean b = true;
            
            for(int k=0; k<n; k++) {
                if(arr[k][minv] > arr[i][minv]) {
                    b = false;
                    break;
                }
            }
            
            if(b == true) {
                System.out.println(arr[i][minv]);
                return;
            }
        }
        System.out.println("Invalid input");  
    }

}

// Sample Input
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
// 41
// 42
// 43
// 44
// Sample Output
// 41
