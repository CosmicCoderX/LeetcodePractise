class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void dfs(TreeNode root, int targetSum ,List<Integer> path){
        if(root == null){
            return;
        }
        targetSum-=root.val;
        path.add(root.val);

        if(root.left == null && root.right == null){
            if(targetSum == 0){
                ans.add(new ArrayList<>(path));
            }
        }else{
            dfs(root.left, targetSum ,path);
            dfs(root.right, targetSum ,path);
        }

        path.remove(path.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum ,new ArrayList<>());
        return ans;
    }
}