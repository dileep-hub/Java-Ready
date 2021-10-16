import java.io.*;
import java.util.*;

public class Main {

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
        
        int dir = 0;
        
        int i=0;
        int j=0;
        
        while(true) {
            if(arr[i][j] == 1) {
                dir = (dir+1) % 4;
            }
            
            if(dir == 0) {
                j++;
            }
            else if(dir == 1) {
                i++;
            }
            else if(dir == 2) {
                j--;
            }
            else if(dir == 3) {
                i--;
            }
            
            if(i >= n) {
                i--;
                break;
            } else if(j >= m) {
                j--;
                break;
            } else if(i<0) {
                i++;
                break;
            } else if(j<0) {
                j++;
                break;
            }
        }
        
        System.out.println(i);
        System.out.println(j);
        
    }

}

// Sample Input
// 4
// 4
// 0
// 0
// 1
// 0
// 1
// 0
// 0
// 0
// 0
// 0
// 0
// 0
// 1
// 0
// 1
// 0
// Sample Output
// 1
// 3
