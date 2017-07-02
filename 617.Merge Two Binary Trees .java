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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        TreeNode Node = new TreeNode((t1 != null ? t1.val : 0) + (t2 != null ? t2.val : 0));
        Node.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        Node.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return Node;
    }
}