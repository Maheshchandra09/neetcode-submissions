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
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        boolean valid = isValidLeftSubTree(root.left,root.val) && isValidRightSubTree(root.right,root.val);
        return valid && isValidBST(root.left) && isValidBST(root.right);
    }


    public boolean isValidLeftSubTree(TreeNode root, int val){
        if(root==null)
            return true;
        if(val<=root.val)
            return false;
        return isValidLeftSubTree(root.left,val) && isValidLeftSubTree(root.right,val);
    }

    public boolean isValidRightSubTree(TreeNode root, int val){
        if(root==null)
            return true;
        if(val>=root.val)
            return false;
        return isValidRightSubTree(root.left,val) && isValidRightSubTree(root.right,val);
    }    
}
