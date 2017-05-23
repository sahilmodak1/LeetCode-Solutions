public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        
        HashMap<Integer, Integer> hmap1 = new HashMap<>(); 
        Stack<Integer> st = new Stack<>();
        int[] answer=new int[findNums.length];
        
        for (int i=0;i<nums.length;i++) 
        {
            while (!st.isEmpty() && st.peek() < nums[i])
                hmap1.put(st.pop(), nums[i]);
            st.push(nums[i]);
        }   
        
        for (int i = 0; i < findNums.length; i++)
            answer[i] = hmap1.getOrDefault(findNums[i], -1);
            
            
        return answer;
    }
}