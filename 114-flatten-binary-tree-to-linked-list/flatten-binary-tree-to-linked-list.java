class Solution {
    public void flatten(TreeNode root) {
        // Using Morris Traversal (O(1) Space)
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode pred = curr.left;

                // Left subtree ka rightmost node dhoondo
                while(pred.right != null){
                    pred = pred.right;
                }

                // Right subtree ko rightmost ke baad attach karo
                pred.right = curr.right;

                // Left subtree ko right me shift karo
                curr.right = curr.left;
                curr.left = null; // Left hamesha null karna hai
            }
            // Agle node par move karo
            curr = curr.right;
        }
    }
}