class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
                            
                        List<Integer> arr = new ArrayList<Integer>();
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
                                arr.add(nums[j]);
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
