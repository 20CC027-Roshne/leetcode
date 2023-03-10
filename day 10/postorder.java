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
   public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        
        if(root == null) {return result;}
        TreeNode node = root;
        TreeNode last = null;
        while(node != null || !stack.isEmpty()) {
            while(node != null) {
                stack.push(node);
                node = node.left;
            } 
                TreeNode peek = stack.peek();
               if(peek.right != null && last != peek.right) { //Turning into right node
                   node = peek.right;
               } else {
                  peek = stack.pop();
                   result.add(peek.val);
                   last = peek;
               }
        }
        return result;
    }
}
