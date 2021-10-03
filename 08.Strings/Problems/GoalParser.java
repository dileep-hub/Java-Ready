class Solution {
    public String interpret(String command) {
        StringBuilder SB = new StringBuilder();
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G'){
                SB.append("G");
            } else if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    SB.append("o");
                } 
                else{SB.append("al");}
            }
        }
        return (SB.toString());
    }
}

// output
// Your input
// "G()(al)"
// Output
// "Goal"
// Expected
// "Goal"
