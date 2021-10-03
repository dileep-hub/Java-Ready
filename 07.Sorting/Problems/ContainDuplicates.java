class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int check = -1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == check) return true;
            check = nums[i];
        }
        return false;
    }
}
