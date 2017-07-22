/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum1=0,sum2;
        
        for(int i:nums)
            sum1=sum1+i;
        
        sum2=(nums.length*(nums.length+1))/2;
        
        return sum2-sum1;
    }
}