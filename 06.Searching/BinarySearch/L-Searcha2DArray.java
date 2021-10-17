class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int[] arr : matrix) {
            if(binarySearch(arr, target) != -1) {
                return true;
            } 
        }
        return false;
    }
    
    static int binarySearch(int[] nums, int n)
    {
        int start = 0;
        int end = nums.length-1;
        while (start <= end)
        {
            int mid = (start+end) / 2;
            if(n > nums[mid])
            {
                start = mid+1;
            }
            else if (n < nums[mid])
            {
                end = mid-1;
            }
            else return mid;
        }
        return -1;
    }
    
    
}

// Accepted
// Runtime: 0 ms
// Your input
// [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
// 3
// Output
// true
// Expected
// true
