class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        res = [''] * len(s)
        for index, char in enumerate(s):
            res[indices[index]] = char
        return "".join(res)
              
  //output
// Your input
// "codeleet"
// [4,5,6,7,0,2,1,3]
// Output
// "leetcode"
// Expected
// "leetcode"
              
