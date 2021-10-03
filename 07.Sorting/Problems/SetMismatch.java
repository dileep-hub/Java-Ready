class Solution {
    public int[] findErrorNums(int[] nums) {
        
                        int i=0;
                        while(i<nums.length)
                            {                           
                                if(nums[i] != i+1)
                                {
                                    int correct = nums[i]-1;
                                    if(nums[i] != nums[correct])
                                    {
                                        swap(nums, i, correct);
                                    }
                                    else {
                                        i++;
                                    }
                                } else {
                                    i++;
                                }

                            }
                        for(int j=0; j<nums.length; j++)
                        {
                            if(nums[j] != j+1)
                            {
                                return new int[] {nums[j], j+1};
                            }

                        }
                        return new int[] {-1,-1};
        
    }
    
    public void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
