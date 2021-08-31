class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int[][] res = new int[image.length][image[0].length];
        for (int i=0; i<image.length; i++)
        {
            int k=0;
            for (int j=image[i].length-1; j>=0; j--)
            {
                 res[i][k] = image[i][j];
                k++;
            }
        }
        
        for (int i=0; i<res.length; i++)
        {
            for (int j=res[i].length-1; j>=0; j--)
            {
                 if(res[i][j] == 0) res[i][j] = 1;
                else res[i][j] = 0;
                
            }
        }
        return res;
    }
}
