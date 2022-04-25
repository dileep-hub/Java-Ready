/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {


    private boolean getPath(TreeNode root, ArrayList<Integer> arr, int x) {

        if(root == null) {
            return false;
        }

        arr.append(root.val);

        if(root.val == x) {
            return true;
        }

        if(getPath(root.left, arr, x) || getPath(root.right, arr, x)) {
            return true;
        }

        arr.remove(arr.size() - 1);
        return false;

    } 



    public int[] solve(TreeNode A, int B) {

        ArrayList<Integer> arr = new ArrayList<>();
        // int[] arr = new int[100];
        if(A == null) return arr;    
        getPath(A, arr, B);
        return arr;


    }
}
