class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) return res;
        
        // true : left to right |  flase: right to left
        boolean flag = true;
        
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int len = queue.size();
            
            List<Integer> subList = new ArrayList<>();
            
            for(int i=0; i<len; i++) {
                if(queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                
                if(flag == true) {
                    subList.add(queue.poll().val);
                } else {
                    subList.add(0, queue.poll().val);
                }
            }
            flag = !flag;
            res.add(subList);
        }
        return res;
    }
}
