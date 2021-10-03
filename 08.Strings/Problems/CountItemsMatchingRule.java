class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            
        int count=0;
        for(int i=0; i<items.size(); i++){
            if (ruleKey.equals("type")  && items.get(i).get(0).equals(ruleValue)) count++;
            else if (ruleKey.equals("color")  && items.get(i).get(1).equals(ruleValue)) count++;
            if (ruleKey.equals("name")  && items.get(i).get(2).equals(ruleValue)) count++;
        }
        return count;
    }
}

// output
// our input
// [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]]
// "color"
// "silver"
// Output
// 1
// Expected
// 1
