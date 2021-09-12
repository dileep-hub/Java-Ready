class Solution {
public int searchInsert(int[] nums, int target) {

    int start = 0;
    int end = nums.length-1;
    int ans = 0;
    
    while(start <= end)
    {
        int mid = start + (end-start) / 2;
        // System.out.println(mid);
        if(nums[mid] > target)
        {
            end = mid-1;
        }
        else if (nums[mid] < target)
        {
            start = mid+1;
            // ans = start;
        }     
        else{
            return mid;
        }
    }
    return start;
}
}

// output
// Accepted
// Runtime: 0 ms
// Your input
// [1,3,5,6]
// 0
// Output
// 0
// Expected
// 0
