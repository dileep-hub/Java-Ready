class Solution {
    public int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        int n = nums.length;
        
        if(n==1)
        {
            return nums[0];
        }
        
        while(start <= end)
        {
            int mid = start + (end-start) / 2;
            if(nums[0] > nums[mid%n])
            {
                end = mid-1;
            }
            else if(nums[mid%n] < nums[(mid+1)%n])
            {
                start = (mid+1)%n;
            }
            else if(nums[mid%n] > nums[(mid+1)%n])
            {
                return nums[(mid+1)%n];
            }
        }
        return -1;
    }
}
