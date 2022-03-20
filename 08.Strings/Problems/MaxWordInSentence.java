class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int ans = 0;
        
        for(String str : sentences) {
            String[] arr = str.split(" ");
            int c = arr.length;
            if(c > ans) {
                ans = c;
            }
        }
        
        return ans;
    }
}
