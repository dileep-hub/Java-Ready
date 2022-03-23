// link :  https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution {
    public int subtractProductAndSum(int n) {
        
        int mul = 1;
        int add = 0;
        
        while(n > 0) {
            
            int m = n%10;
            mul *= m;
            add += m;
            n = n/10;
        }
        return mul - add;
    }
}
