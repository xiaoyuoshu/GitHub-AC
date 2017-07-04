/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null)   return true;
        Integer max = null , min = null;
        if(max != null && root.val >= max) return false;
        if(min != null && root.val <= min) return false;
        return isValidBST(root.left , root.val , min) && isValidBST(root.right , max , root.val); 
    }
    public boolean isValidBST(TreeNode root, Integer max, Integer min){
       if(root==null)   return true;
        if(max != null && root.val >= max) return false;
        if(min != null && root.val <= min) return false;
        return isValidBST(root.left , root.val , min) && isValidBST(root.right , max , root.val);  
    }
}