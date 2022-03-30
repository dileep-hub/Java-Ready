class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> hash = new HashMap<>();
        
        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);
        
        int i=s.length()-1;
        int ans = 0;
        
        while(i >= 0) {
            
            if( i == 0) {
                ans += hash.get(s.charAt(i));
                return ans;
            }
            
            else if( hash.get(s.charAt(i-1)) < hash.get(s.charAt(i)) ) {
                ans += hash.get(s.charAt(i)) - hash.get(s.charAt(i-1))  ;
                i -= 2;
            }  else {
                ans += hash.get(s.charAt(i));
                i--;
            }
        }
        
        return ans;
        
    }
}
