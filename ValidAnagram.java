/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
*/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] allchars = new int[26];
        
        for (int i = 0; i < s.length(); i++) 
            allchars[s.charAt(i) - 'a']++;
            
        for (int i = 0; i < t.length(); i++) 
            allchars[t.charAt(i) - 'a']--;
            
        for (int i = 0; i< allchars.length;i++) 
            if (allchars[i] != 0) 
                return false;
        
        return true;
    }
}