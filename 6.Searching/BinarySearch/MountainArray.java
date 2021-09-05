class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end)
        {
            int mid = ( start + end ) / 2;
            if(arr[mid] < arr[mid+1])
            {
                start = mid+1;
            }
            else if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
        }
        return start;
    }
}

// output
// Your input
// [0,1,0]
// Output
// 1
// Expected
// 1

//BRUTE FORCE SOLUTION   Runtime: 0ms
// for(int i = 0; i<arr.length; i++)
//         {
//             if(arr[i+1] < arr[i])
//             {
//                 return i;
//             }
//         }
//         return -1;
