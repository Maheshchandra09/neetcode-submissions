/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> nodes = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null)
            q.add(root);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int len = q.size();
            for(int i=0;i<len;i++){
                TreeNode n = q.remove();
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
                
                l.add(n.val);
            }
            nodes.add(l);
        }
        return nodes;
    }
}
