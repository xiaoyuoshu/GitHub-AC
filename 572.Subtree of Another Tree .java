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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null) return false;
        else if(isSameTree(s, t)) return true;
        else return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null && q != null) return false;
        else if(p != null && q == null) return false;
        else{
            if(p.val != q.val) return false;
            else return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
        }
    }
}