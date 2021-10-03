class Solution {
    public int mySqrt(int x) {
        
        // int s = 1;
        long i =1;
        
        while(true)
        {
            if(i*i >= x)
            {
                if(i*i == x)
                {
                    return (int)i;
                }
                return (int)i-1;
            }
            // else if(i*i == )
            i++;
        }
        
    }
}
