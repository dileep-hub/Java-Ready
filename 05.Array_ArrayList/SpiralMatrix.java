class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        int minc = 0;
        int minr = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        
        int maxcount = (maxr+1) * (maxc+1) ;
        
        int count = 0;
        while (count < maxcount) {
            
            for(int i=minr, j=minc; j<=maxc ; j++){
                arr.add( matrix[i][j] );
                count++;
            }
            minr++;
            
            for(int i=minr, j=maxc; i<=maxr && count < maxcount; i++){
                arr.add( matrix[i][j] );
                count++;
            }
            maxc--;
            
            for(int i=maxr, j=maxc; j>=minc  && count < maxcount ; j--){
                arr.add( matrix[i][j] );
                count++;
            }
            maxr--;
            
            for(int i=maxr, j=minc; i>=minr && count < maxcount; i--){
                arr.add( matrix[i][j] );
                count++;
            }
            minc++;
           
        }   
        return arr;        
    }
}

// Your input
// [[1,2,3],[4,5,6],[7,8,9]]
// [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output
// [1,2,3,6,9,8,7,4,5]
// [1,2,3,4,8,12,11,10,9,5,6,7]
// Expected
// [1,2,3,6,9,8,7,4,5]
// [1,2,3,4,8,12,11,10,9,5,6,7]
