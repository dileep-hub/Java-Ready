import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] ar = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        
        int[][] ar2 = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                ar2[j][n-1-i] = ar[i][j];
            }
        }
        
        display(ar2);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
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
// 41 31 21 11
// 42 32 22 12
// 43 33 23 13
// 44 34 24 14
