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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        inorder(root,r);
        return r;
    }
    public void inorder(TreeNode root,List<Integer> r){
        if(root != null){
            inorder(root.left,r);
            r.add(root.val);
            inorder(root.right,r);
        }
    }
}