class Solution {
    public int largestAltitude(int[] gain) {
        
        int max = 0;
        int prev = 0;
        for (int i=0; i<gain.length; i++)
        {
            gain[i] += prev;
            if (gain[i] > max) {
                max = gain[i];
            }
            prev = gain[i];
        }
        return max;
        
    }
}
