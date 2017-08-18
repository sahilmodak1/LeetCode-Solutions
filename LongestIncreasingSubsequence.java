/*
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.
*/
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)
            return 0;
        
        int[] opt=new int[nums.length];
        Arrays.fill(opt, 1);
        
        for(int i=1;i<opt.length;i++)
            for(int j=0;j<i;j++)
                if(nums[j]<nums[i])
                    opt[i]=Math.max(opt[i],opt[j]+1);
        
        int max=1;
        for(int i:opt)
            if(i>max)
                max=i;
        
        return max;
    }
}