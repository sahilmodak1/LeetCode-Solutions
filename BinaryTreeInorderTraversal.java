/*
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
*/
   
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        
        if (root == null) 
            return ans;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        
        while (node != null) 
        {
            stack.push(node);
            node = node.left;
        }
         
        
        while (stack.size() > 0) 
        {
           
            node = stack.pop();
            ans.add(node.val);
            
            if (node.right != null) 
            {
                node = node.right;
                 
                while (node != null) 
                {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
        
        return ans;
        
    }
}