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
    private Map<Integer,Integer>hm = new HashMap<>();
    private int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0)
            return null;
        for(int i=0;i<preorder.length;i++){
            hm.put(inorder[i],i);
        }
        return build(preorder,inorder,0,preorder.length-1);
    }
    public TreeNode build(int[]preorder,int[]inorder,int left,int right){
        if(left>right){
            return null;
        }
        int val = preorder[idx++];
        TreeNode root = new TreeNode(val);
        root.left = build(preorder,inorder,left,hm.get(val)-1);
        root.right = build(preorder,inorder,hm.get(val)+1,right);
        return root;
    }
}
