class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
      for(int i=0; i<numbers.length-1; i++)
      {
          int ans = target - numbers[i];
          if(binarySearch(numbers, ans, i+1, numbers.length-1) != -1)
          {
              int k = binarySearch(numbers, ans, i+1, numbers.length-1);
              return  new int[] {i+1, k+1};
          }
          
      }
        return new int[] {-1,-1};
    }
             
        
        // for(int i=0; i<numbers.length-1; i++)
        // {
        //     for(int j=i+1; j<numbers.length; j++)
        //     {
        //         if(numbers[i]+numbers[j] == target){
        //             return new int[] {i+1,j+1};    
        //         }                
        //     }
        // }
        // return new int[] {-1,-1};
        
    // }
    
    
    public int binarySearch(int[] nums, int n, int start, int end)
    {
//        int ind = nums.length;
        // int start = 0;
        // int end = nums.length-1;
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


// output
// Accepted
// Runtime: 0 ms
// Your input
// [2,3,4]
// 6
// Output
// [1,3]
// Expected
// [1,3]
