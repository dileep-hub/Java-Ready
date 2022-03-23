class Solution {
    public int xorOperation(int n, int start) {
        
        int ans = 0;
        for(int i=start; i<2*n+start; i=i+2) {
            ans ^= i;
        }        
        return ans; 
    }
}
