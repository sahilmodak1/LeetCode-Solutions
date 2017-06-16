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