public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars=new int[26];
        
        for(int i=0;i<ransomNote.length();i++)
            chars[ransomNote.charAt(i)-'a']=chars[ransomNote.charAt(i)-'a']+1;
        
        for(int i=0;i<magazine.length();i++)
            chars[magazine.charAt(i)-'a']=chars[magazine.charAt(i)-'a']-1;
        
        for(int i:chars)
            if(i>0)
                return false;
        
        return true;
    }
}