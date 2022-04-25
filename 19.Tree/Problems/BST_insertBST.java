class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode root1 = root;
        
        if(root == null) {
            root = new TreeNode(val);
            return root;
        }
        
        while(true) {
            if(val > root1.val) {
                if(root1.right != null) {
                    root1 = root1.right;
                } else {
                    // root1.right.val = val;
                    root1.right = new TreeNode(val);
                    return root;
                }
            }
            else if(val < root1.val) {
                if(root1.left != null) {
                    root1 = root1.left;
                } else {
                    // root1.left.val = val;
                    root1.left = new TreeNode(val);
                    return root;
                }
            }
        }
    }
}
