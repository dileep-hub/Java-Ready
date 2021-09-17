class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int i=0;
        while(i<nums.length)
        {
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != i+1 && nums[i] != nums[nums[i]-1])
            {
                swap(nums, i, nums[i]-1);
            }
            else {
                i++;
            }
        }
        
        for(int j=0; j<nums.length; j++)
        {
            if(nums[j] != j+1)
            {
                return j+1;
            }
        }
        return nums.length+1;
        
    }
    public void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}