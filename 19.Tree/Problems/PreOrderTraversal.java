// link : https://leetcode.com/problems/binary-tree-preorder-traversal/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        // create an ArrayList
        ArrayList res = new ArrayList<Integer>();
        
        // check weather the val is null
        if(root == null) {
            return res;
        }
        
        // if not null add it to the res arrayList
        if(root != null) {
            res.add(root.val);
        }
        
        // Now call the func for the left subtree
        res.addAll(preorderTraversal(root.left));
        // then call for right subtree
        res.addAll(preorderTraversal(root.right));
        
        // return the arraylist
        return res;
            
    }
}
