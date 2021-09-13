class Solution {
    public boolean checkIfExist(int[] arr) {
        
        int div = 0;
        // boolean b = false;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2 == 0){
                
                // System.out.println(arr[i]);
                div = arr[i]/2;
                // System.out.println(div);
                // System.out.println(search(arr, div));
                if(search(arr, div) != -1)
                {   
                return true;
                }
                
            }
        }
        return false;
        
    }
    
    public int search(int[] nums, int n)
    {
        if(n==0)
        {
            int count = 0;
            for(int i=0; i<nums.length; i++)
            {
                if (nums[i] == 0)
                {
                    count++;
                }
            }
            if(count <= 1)
            {return -1;}
        }
        for(int i=0; i<nums.length; i++)
        {
            if (nums[i] == n)
            {
                return i;
            }
        }
        return -1;
    }
}

//output
// Your input
// [10,2,5,3]
// Output
// true
// Expected
// true
