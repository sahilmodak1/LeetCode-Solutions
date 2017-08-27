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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length=0)
            return null;
        
        return compute(nums,0,nums.length-1);
    }
    
    public TreeNode compute(int [] nums, int start, int end)
    {
        if(start>end)
            return null;
        
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        TreeNode.left = compute(arr, start, mid - 1);
        TreeNode.right = compute(arr, mid + 1, end);

        return node;
    }
}