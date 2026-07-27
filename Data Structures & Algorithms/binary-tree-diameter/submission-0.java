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
    int maxDiameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        calcHeight(root);
        return maxDiameter;
    }

    public int calcHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight = calcHeight(root.left);
        int rightHeight = calcHeight(root.right);
        maxDiameter = Math.max(maxDiameter,leftHeight+rightHeight);
        return 1+Math.max(leftHeight,rightHeight);
    }
}
