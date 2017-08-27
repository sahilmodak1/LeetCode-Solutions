/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
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
class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        if(nums.length==0)
            return null;
        TreeNode node=compute(nums,0,nums.length-1);
        return node;
    }
    
    public TreeNode compute(int [] nums, int start, int end)
    {
        if(start>end)
            return null;
        
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = compute(nums, start, mid - 1);
        node.right = compute(nums, mid + 1, end);

        return node;
    }
}