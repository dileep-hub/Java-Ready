class Solution {
    public int search(int[] nums, int target) {
        
//         int pivot = findPivot(nums);

//         if (nums[pivot] == target)
//         {
//             return(pivot);
//         }
//         else if (binarySearch(nums, target, 0, pivot-1) == -1)
//         {
//             return(binarySearch(nums, target, pivot+1, nums.length-1));
//         }
//         else {
//             return(binarySearch(nums, target, 0, pivot-1));
//         }
        
        return(searchh(nums, target));
        
    }
     
    public int searchh(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    
    
    public int binarySearch(int[] nums, int n, int start, int end) 
    {
//        int ind = nums.length;
//        int start = 0;
//        int end = nums.length-1;
        while (start <= end)
        {
            int mid = (start+end) / 2;
            if(n > nums[mid])
            {
                start = mid+1;
            }
            else if (n < nums[mid])
            {
                end = mid-1;
            }
            else return mid;
        }
        return -1;
    }
    
    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
}


// output
// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
// Example 2:

// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1
// Example 3:

// Input: nums = [1], target = 0
// Output: -1
