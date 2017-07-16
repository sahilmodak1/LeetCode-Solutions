/*
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
*/
/*
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.left.left.left=new TreeNode(8);
        
        System.out.println(maxDepth(root));
      
    }*/
    public class MaximumDepthOfBinaryTree{
    public static int maxDepth(TreeNode root) {
     
     if (root == null)
            return 0;
        else
        {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            
            
  
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
        
    }
   }
    
