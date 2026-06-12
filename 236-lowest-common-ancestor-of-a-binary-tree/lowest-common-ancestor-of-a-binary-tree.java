/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null; //reached end, found nothing
        if(root == p || root == q) return root; //found p or q, send it up

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;      // p and q split here
        }
        if(left != null){
            return left;      // pass answer upward
        }
        if(right != null){
            return right;     // pass answer upward
        }
        return null;
    }
}