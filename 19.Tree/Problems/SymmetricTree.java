class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        return root == null || isSymmetricH(root.left, root.right);
        
    }
    
    
    private boolean isSymmetricH(TreeNode left, TreeNode right) {
        
        if(left == null || right == null) {
            return left == right;
        }
        
        if(left.val != right) return false;
        
        return isSymmetricH(left.left, right.right) && 
            isSymmetricH(left.right, right.left);
        
    }
    
}
