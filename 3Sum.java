/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/
class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
 
    List<List<Integer>> ans=new ArrayList<>();

    Arrays.sort(nums);

    for (int i=0; i<nums.length-2; i++)
    {
        if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
        int l = i + 1;
        int r = nums.length - 1;
        int x = nums[i];
        while (l < r)
        {
            if (x + nums[l] + nums[r] == 0)
            {
                ans.add(Arrays.asList(x,nums[l],nums[r]));
                while (l<r && nums[l]==nums[l+1])
                    l++;
                while (l<r && nums[r]==nums[r-1])
                    r--;
                l++;
                r--;
            }
 
            else if (x + nums[l] + nums[r] < 0)
                l++;
 
            else
                r--;
        }
       }
    }
  
    return ans;
 }
}