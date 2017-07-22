/*

Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
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