/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        
        ArrayList a = new ArrayList<>();
        
        ArrayList arr =  Helper(root,  a);
        int ans = (int)arr.get(k-1);
        return ans;
    }
    
    
    public static  ArrayList Helper(TreeNode root, ArrayList a) {
        
        if(root == null) {
            return a;
        }
        
        Helper(root.left, a);
        a.add(root.val);
        Helper(root.right, a);
        
        return a;
        
    }
    
    
}
