class Solution {
    public String sortSentence(String s) {
        
        String[] strarr = s.split(" ");
        String[] sf = new String[strarr.length];
        StringBuilder SB = new StringBuilder();
        
        int x = 0;
        for(String str : strarr) {
            x = (int) (str.charAt( str.length() -1) - '0'); 
            sf[x-1] = str.substring(0, str.length() -1);
        }
        
        for(int i=0; i<sf.length; i++) {
            if(i == sf.length-1) {
                SB.append(sf[i]);
            }
            else SB.append(sf[i]).append(" ");
        }
        return SB.toString();
        
    }
}

// output
// Your input
// "is2 sentence4 This1 a3"
// Output
// "This is a sentence"
// Expected
// "This is a sentence"
