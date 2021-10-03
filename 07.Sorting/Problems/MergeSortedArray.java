class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       int j = 0;
       for(int i=m; i<nums1.length; i++)
       {
           nums1[i] = nums2[j];
           j++;
       }
        // System.out.println(Arrays.toString(nums1));
        // Arrays.sort(nums1);
        insertionSort(nums1);
        // System.out.println(Arrays.toString(nums1));
        
    }
    
    public void insertionSort(int[] arr)
    {
        for(int i=0; i< arr.length-1; i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    public void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

//output
// Your input
// [1,2,3,0,0,0]
// 3
// [2,5,6]
// 3
// Output
// [1,2,2,3,5,6]
// Expected
// [1,2,2,3,5,6]
