ublic class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        
        ArrayList<Integer> a=new ArrayList<>();
        String[] ans=new String[nums.length];
        
        for(int i:nums)
            a.add(i);
        
        Collections.sort(a,Collections.reverseOrder());
        
        for(int i=0;i<nums.length;i++)
        {
            int index=a.indexOf(nums[i]);
            if(index>2)
                ans[i]=Integer.toString(index+1);
            else if(index==0)
                ans[i]="Gold Medal";
            else if(index==1)
                ans[i]="Silver Medal";
            else if(index==2)
                ans[i]="Bronze Medal";
        }
        
        return ans;
        
    }
}