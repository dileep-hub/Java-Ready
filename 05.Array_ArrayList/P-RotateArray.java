import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    // write your code here
    int n = a.length;
    
    int[] b = new int[n];
    for(int i=0; i<n; i++) {
        b[i] = a[i];
        // System.out.println(b[i]);
    }
    
    // System.out.println(b[i]);
    
    for(int i=0; i<n; i++) {
        a[(i+k)%n] = b[i];
    }
          
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}

// Sample Input
// 5
// 1
// 2
// 3
// 4
// 5
// 3
// Sample Output
// 3 4 5 1 2
