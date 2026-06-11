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
        if(root == null) return null;
        if(root == p || root == q) return root;

        boolean pInLeft = contains(root.left, p);
        boolean qInLeft = contains(root.left, q);

        // Both are in left subtree
        if(pInLeft && qInLeft) {
            return lowestCommonAncestor(root.left, p, q);
        }

        // Both are in right subtree
        if(!pInLeft && !qInLeft) {
            return lowestCommonAncestor(root.right, p, q);
        }

        // One in left, one in right
        return root;
    }
    public boolean contains(TreeNode root, TreeNode node){
        if(root == null) return false;
        if(root == node) return true;
        return contains(root.left, node) || contains(root.right, node);
    }
}