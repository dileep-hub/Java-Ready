class Solution {
    public int countNegatives(int[][] grid) {
        
        int count=0;
        for(int i=0; i<grid.length; i++)
        {
            int start = 0;
            int end = grid[i].length-1;
            // System.out.println(Arrays.toString(grid[i]));
            
            while(start <= end)
            {
                int mid = start + (end-start) / 2;
                if(grid[i][mid] < 0)
                {
                    end = mid-1;
                }
                else if(grid[i][mid] >= 0)
                {
                    start = mid+1;
                }
            }
            
            count = count + (grid[i].length - start);
            
        }
        return count;
    }
}
// output
// Your input
// [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output
// 8
// Expected
// 8
