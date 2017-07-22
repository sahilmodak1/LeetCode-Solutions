/*
Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
*/
public class RelativeRanks {
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