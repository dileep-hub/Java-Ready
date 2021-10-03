class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;
        int len = mat[0].length-1;
        for (int i=0; i < mat.length; i++)
        {
            if ( i == len-i)
            {
                sum += mat[i][i];
            }
            else {
            sum += mat[i][i] + mat[i][len-i];    
        
            }
        }
        return sum;
    }
}

//output
// Your input
// [[1,2,3],[4,5,6],[7,8,9]]
// Output
// 25
// Expected
// 25
