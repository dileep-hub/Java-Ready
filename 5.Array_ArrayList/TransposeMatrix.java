class Solution {
    public int[][] transpose(int[][] matrix) {
        int [][] arr = new int[matrix[0].length][matrix.length];
        for (int i=0; i<matrix[0].length; i++)
        {
            int k = 0;
            while(k<matrix.length)
            {
                arr[i][k] = matrix[k][i];
                k++;
            }
        }
        return arr;
        
    }
}
