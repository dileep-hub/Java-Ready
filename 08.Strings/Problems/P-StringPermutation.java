import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		// write your code here
		
		int l = str.length();
		int fac = fact(l);
		
		for(int i=0; i<fac; i++) {
		    StringBuilder sb = new StringBuilder(str);
		    
		    for(int j=l; j>0; j--) {
		        int rem = i%j;
		        System.out.print(sb.charAt(rem) );
		        sb.deleteCharAt(rem);
		        
		    }
		    System.out.println();
		    
		    
		}
		
		
	}
	
	public static int fact(int n) {
	    int res = 1;
	    for(int i=1; i<=n; i++) {
	        res *= i;
	    }
	    return res;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}

// Sample Input
// abc
// Sample Output
// abc
// bac
// cab
// acb
// bca
// cba
