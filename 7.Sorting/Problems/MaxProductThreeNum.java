class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length-1;
        // System.out.println(Arrays.toString(nums));
        
        if(nums[0] >= 0 || nums[n] < 0)
        {
            return (nums[n]*nums[n-1]*nums[n-2]);    
        }
        else if(nums[0]*nums[1]*nums[n] < nums[n]*nums[n-1]*nums[n-2])
        {
            return nums[n]*nums[n-1]*nums[n-2];
        }
        else {
            return (nums[0]*nums[1]*nums[n]);
        }
        
        
        
        
    }
}
