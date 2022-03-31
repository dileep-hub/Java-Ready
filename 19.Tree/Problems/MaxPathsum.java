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
    public int maxPathSum(TreeNode root) {
        
        if(root.left == null && root.right == null) {
            return root.val;
        }
        
        int[] maxi = new int[1];
        maxi[0] = -1000;
        maxSum(root, maxi);
        return maxi[0];
        
    }
    
    public int maxSum(TreeNode root, int[] maxi) {
        
        if(root == null) {
            return 0;
        } 
        
        int lh = Math.max(0,maxSum(root.left, maxi));
        int rh = Math.max(0,maxSum(root.right, maxi));
        maxi[0] = Math.max(maxi[0] , lh + rh + root.val);
        
        return root.val + Math.max(lh, rh);
        
    }
    
}
