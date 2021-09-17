class Solution {
    public int missingNumber(int[] nums) {
        
        int  i=0;
        while(i<nums.length)
        {
            if(nums[i] >= nums.length)
            {i++;}
            else if(nums[i] != i)
            {
                swap(nums, i, nums[i]);
            }
            else {
                i++;
            }
        }
        for(int j=0; j<nums.length; j++)
        {
            if(nums[j] != j) return j;
        }
        return nums.length;
    }
    
    public void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
