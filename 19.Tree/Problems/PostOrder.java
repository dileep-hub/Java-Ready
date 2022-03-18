// link : https://leetcode.com/problems/binary-tree-postorder-traversal/

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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        ArrayList res = new ArrayList<Integer>();
        
        if(root == null) {
            return res;
        }
        
        res.addAll(postorderTraversal(root.left));
        
        res.addAll(postorderTraversal(root.right));
        
        res.add(root.val);
        
        return res;
        
        
    }
}
