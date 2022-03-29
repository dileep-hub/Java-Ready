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
    public boolean isBalanced(TreeNode root) {
        
        return checkH(root) != -1;
        
    } 
    
    int checkH(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int leftH = checkH(root.left);
        if(leftH == -1) return -1;
        int rytH = checkH(root.right);
        if(rytH == -1) return -1;
        
        if(Math.abs(leftH - rytH ) > 1) return -1;
        return Math.max(leftH, rytH) + 1;
        
    }   
    
}
