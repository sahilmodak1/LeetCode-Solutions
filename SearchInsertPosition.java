/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
*/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                low=mid+1;
            else if(nums[mid]>target)
                high=mid-1;
        }
        
        return low;
        
    }
}