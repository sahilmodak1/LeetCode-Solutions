public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int ans=0;
        
        for(int i=0;i<s.length();i++)
            ans+=Math.pow(26,s.length()-1-i)*(s.charAt(i)-'A'+1);
        
        return ans;
    }
}