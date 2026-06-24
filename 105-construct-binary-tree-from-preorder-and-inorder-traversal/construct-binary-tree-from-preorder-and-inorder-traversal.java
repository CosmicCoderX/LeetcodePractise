class Solution {
    public TreeNode helper(int[] preorder, int preLow, int preHigh, int[] inorder, int inLow, int inHigh){
        if(preLow > preHigh) return null;
        TreeNode root = new TreeNode(preorder[preLow]);
        int i = inLow;
        while(inorder[i] != preorder[preLow]) i++;
        int leftSize = i - inLow;
        root.left = helper(preorder, preLow+1, preLow+leftSize, inorder, inLow, i-1);
        root.right = helper(preorder, preLow+leftSize+1, preHigh, inorder, i+1, inHigh);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, 0, n-1, inorder, 0, n-1);
    }
}