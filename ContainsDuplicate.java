/*
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
*/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int i:nums)
            a.add(i);
            
        if(nums.length==a.size())
            return false;
        
        return true;
    }
}