class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int n = nums.length, k=0, i=0;
        int[] arr = new int[n];
        int j = 1;
        
        while(k<n)
        {
            if(nums[k]%2 == 0)
            {
                arr[i] = nums[k];
                i = i+2;
            }
            else {
                arr[j] = nums[k];
                j = j+2;
            }
            k++;
        }
        return arr;
        
    }
}
