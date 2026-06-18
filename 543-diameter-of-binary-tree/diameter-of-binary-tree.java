class Solution {
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);

        return Math.max(lh + rh, Math.max(ld, rd));
    }
}