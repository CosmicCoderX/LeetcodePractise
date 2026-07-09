class Solution {
    public TreeNode findMin(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        } else if(root.val < key){
            root.right = deleteNode(root.right, key);
        } else{
            //Case-1: 0 Child
            if(root.left == null && root.right == null){
                return null;
            }

            //Case-2: 1 Child
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            //Case-3: 2 Child
            TreeNode successor = findMin(root.right); //inorder successor
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }
        return root;
    }
}