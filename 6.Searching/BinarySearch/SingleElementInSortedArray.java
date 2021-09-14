class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        int n = nums.length;
        
        if(end == 0)
        return nums[end];
        else if(nums[n-2] != nums[n-1])
        return nums[n-1];
        else if(nums[0] != nums[1])
        return nums[0];
          
        while(start <= end)
        {
            int mid = start + (end-start) / 2;
            
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
            {
                return nums[mid];
            }
            else if((mid%2 != 0 && nums[mid] == nums[mid-1]) || 
                    (mid%2 == 0 && nums[mid] == nums[mid+1]))
            {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
        
    }
}

// output
// Accepted
// Runtime: 0 ms
// Your input
// [1,1,2,3,3,4,4,8,8]
// Output
// 2
// Expected
// 2
