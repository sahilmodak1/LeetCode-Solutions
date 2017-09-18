/*
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].
*/
class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        ans[0]=1;
        for (int i=1;i<nums.length;i++) 
            ans[i]=ans[i-1]*nums[i-1];
        
        int accum_right=1;
        for (int i=nums.length-1;i>=0;i--) 
        {
            ans[i]*=accum_right;
            accum_right*=nums[i];
        }
        return ans;
    }
}