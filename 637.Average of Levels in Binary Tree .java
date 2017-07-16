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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> for_return = new ArrayList<>();
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int flag = 1;
        while(!queue.isEmpty()){
            int tag = flag;
            double sum = 0;
            flag = 0;
            for(int i = 0; i < tag; i++){
                TreeNode temp = queue.remove();
                sum += temp.val;
                if(temp.left != null){
                    queue.add(temp.left);
                    flag++;
                }
                if(temp.right != null){
                    queue.add(temp.right);
                    flag++;
                }
            }
            for_return.add(sum / tag);
        }
        return for_return;
    }
}