class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder SB1 = new StringBuilder();
        StringBuilder SB2 = new StringBuilder();
        for(String str:word1){
            SB1.append(str);
        }
        for(String str:word2){
            SB2.append(str);
        }
        
        if(SB1.toString().equals(SB2.toString())) return true;
        else return false;
        
    }
}

// output
// Your input
// ["ab", "c"]
// ["a", "bc"]
// Output
// true
// Expected
// true
