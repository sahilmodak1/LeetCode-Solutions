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