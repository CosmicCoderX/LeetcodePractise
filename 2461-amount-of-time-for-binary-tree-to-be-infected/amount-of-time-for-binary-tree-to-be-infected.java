class Solution {
    // Start value wali node ko find karne ke liye
    public TreeNode getNode(TreeNode root, int start){
        if(root == null) return null;
        if(root.val == start) return root;

        // Pehle left subtree me dhundo
        TreeNode left = getNode(root.left, start);
        if(left != null){
            return left;
        }

        // Left me na mile to right me dhundo
        return getNode(root.right, start);
    }

    // Har node ka parent store kar lo
    public void preorder(TreeNode root, Map<TreeNode, TreeNode> parent){
        if(root == null) return;

        if(root.left != null) parent.put(root.left, root);
        if(root.right != null) parent.put(root.right, root);

        preorder(root.left, parent);
        preorder(root.right, parent);
    }

    public int amountOfTime(TreeNode root, int start) {
        // Infection start hone wali node
        TreeNode node = getNode(root, start);

        // Child -> Parent mapping
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        preorder(root, parent);

        // BFS start from infected node
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);

        // Node aur uska infection time store karega
        Map<TreeNode, Integer> isVisited = new HashMap<>();
        isVisited.put(node, 0);

        while(!q.isEmpty()){
            TreeNode temp = q.remove();
            int level = isVisited.get(temp);

            // Left child infect karo
            if(temp.left != null && !isVisited.containsKey(temp.left)){
                q.add(temp.left);
                isVisited.put(temp.left, level + 1);
            }

            // Right child infect karo
            if(temp.right != null && !isVisited.containsKey(temp.right)){
                q.add(temp.right);
                isVisited.put(temp.right, level + 1);
            }

            // Parent ko bhi infect karo
            if(parent.containsKey(temp) && !isVisited.containsKey(parent.get(temp))){
                q.add(parent.get(temp));
                isVisited.put(parent.get(temp), level + 1);
            }
        }

        // Maximum infection time nikal lo
        int max = -1;
        for(int level : isVisited.values()){
            max = Math.max(max, level);
        }

        return max;
    }
}