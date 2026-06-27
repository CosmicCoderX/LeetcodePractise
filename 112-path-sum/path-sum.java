class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        targetSum-=root.val;

        if(root.left == null && root.right == null){
            if(targetSum == 0){
                return true;
            }else{
                return false;
            }
        }else{
            return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
        }

    }
}