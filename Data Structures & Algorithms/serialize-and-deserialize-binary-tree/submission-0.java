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

public class Codec {
    private static final String SPLITTER = ",";
    private static final String NULL_MARKER = "#";

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NULL_MARKER).append(SPLITTER);
            return;
        }
        
        sb.append(node.val).append(SPLITTER);
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodesQueue = new LinkedList<>(Arrays.asList(data.split(SPLITTER)));
        return deserializeHelper(nodesQueue);
    }

    private TreeNode deserializeHelper(Queue<String> queue) {
        String currentValue = queue.poll();
        
        if (currentValue.equals(NULL_MARKER)) {
            return null;
        }
        
        TreeNode node = new TreeNode(Integer.parseInt(currentValue));
        
        node.left = deserializeHelper(queue);
        node.right = deserializeHelper(queue);
        
        return node;
    }
}