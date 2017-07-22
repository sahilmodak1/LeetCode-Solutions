/*
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1

*/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        
        if (root==null) 
            return root;
     
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
     
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
     
        return root;

               
    }
}