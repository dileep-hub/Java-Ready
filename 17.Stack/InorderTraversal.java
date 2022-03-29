class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> reslist = new ArrayList<Integer>();
        
        if(root == null)  {
            return reslist;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode node = root;
        
        while(true) {
            if(node != null) {
                stack.push(node);
                node = node.left;
            }
            else {
                if(stack.isEmpty()) {
                    break;
                } 
                node = stack.pop();
                reslist.add(node.val);
                node = node.right;
            }
        }
        
        return reslist;        
    }
}
