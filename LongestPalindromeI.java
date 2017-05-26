/*
*
* Using HashMap 
*
*/
public class LongestPalindromeI {
    public int longestPalindrome(String s) {
        int ans=0;
        boolean flag=false;
        Map<Character,Integer> hmap1=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
            if(!hmap1.containsKey(s.charAt(i)))
                hmap1.put(s.charAt(i),1);
            else
                hmap1.replace(s.charAt(i),hmap1.get(s.charAt(i))+1);
        
        //System.out.println(hmap1);
        for(char key : hmap1.keySet())
            if(hmap1.get(key)%2 == 0)
                ans+=hmap1.get(key);
            else 
            {
                ans+=hmap1.get(key)-1;
                flag=true;
            }
           
        if(flag)
            return ans+1;
        
        return ans;
    }
}