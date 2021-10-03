class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
                        int i=0;
                        while(i<nums.length)
                            {
                                if(nums[i] != i+1 && nums[nums[i]-1] != nums[i])
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
                                    arr.add(j+1);
                                }
                            }
        return arr;
                            
                            
        
    }
    public void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
