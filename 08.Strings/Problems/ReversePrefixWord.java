class Solution {
    public String reversePrefix(String word, char ch) {
        
        StringBuilder SB = new StringBuilder();
        
        for(int i=0; i<word.length(); i++) {
            if (word.charAt(i) == ch) {
                String s = word.substring(0,i+1);
                SB.append(s).reverse().append(word.substring(i+1, word.length()));
                return (SB.toString());
            }
        }
        return word;
        
    }
}

// output
// Your input
// "abcdefd"
// "d"
// Output
// "dcbaefd"
// Expected
// "dcbaefd"
