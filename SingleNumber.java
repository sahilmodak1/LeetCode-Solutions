/*
Given an array of integers, every element appears twice except for one. Find that single one.
*/
public class SingleNumber {
    public int singleNumber(int[] nums) {
      
     int ans = 0;
     for (int i = 0; i<nums.length; i++)
		ans=ans^nums[i];
		
	 return ans;
    }
}