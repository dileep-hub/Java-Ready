// link : https://leetcode.com/problems/maximum-69-number/

class Solution {
    public int maximum69Number (int num) {
        
        String str = String.valueOf(num);
        
        char[] carr = str.toCharArray();
        
        for(int i=0; i < carr.length; i++) {
            if(carr[i] == '6') {
                carr[i] = '9';
                str = String.valueOf(carr);
                return Integer.parseInt(str);
            }
        }   
        return num;
    }
}
