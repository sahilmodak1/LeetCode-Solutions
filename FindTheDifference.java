public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        s+=t;
        
        int ans=0;
        for(int i=0;i<s.length();i++)
            ans=ans^s.charAt(i);
        
        return((char)ans);
    }
}