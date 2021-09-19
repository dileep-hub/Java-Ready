class Solution {
    public int heightChecker(int[] heights) {
        
        int[] sortHeight = new int[heights.length];
        for(int i=0 ; i<sortHeight.length; i++)
        {
            sortHeight[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i=0; i<heights.length; i++)
        {
            if(heights[i] != sortHeight[i])
            {
                count++;
            }
        }
        
        return count;
    }
}
