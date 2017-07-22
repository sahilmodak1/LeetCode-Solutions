/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] ans;
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        
        for(int i:nums1)
            a.add(i);
        
        for(int i:nums2)
            if(a.contains(i))
                b.add(i);
        
        ans=new int[b.size()];
        int j=0;
        for(int i:b)
        {
            ans[j]=i;
            j++;
        }
        
        return ans;
    }
}