/*
We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.

Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.

Example 1:
Input: [1,3,2,2,5,2,3,7]
Output: 5

Explanation: The longest harmonious subsequence is [3,2,2,2,3].
*/
public class LongestHarmoiousSubsequence {
    public int findLHS(int[] nums) {
        HashMap <Integer,Integer> hmap1 = new HashMap <>();
        int ans = 0;
        
        for (int num: nums) 
            hmap1.put(num, hmap1.getOrDefault(num, 0) + 1);
        
        for (int key: hmap1.keySet()) 
            if (hmap1.containsKey(key + 1))
                ans = Math.max(ans, hmap1.get(key) + hmap1.get(key+1));
        
        
        return ans;
    }
}