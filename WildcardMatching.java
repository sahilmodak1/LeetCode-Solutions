/*
Implement wildcard pattern matching with support for '?' and '*'.

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") ? false
isMatch("aa","aa") ? true
isMatch("aaa","aa") ? false
isMatch("aa", "*") ? true
isMatch("aa", "a*") ? true
isMatch("ab", "?*") ? true
isMatch("aab", "c*a*b") ? false
*/
public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        if(s.equals(p))
            return true;
        if(p.length()==0)
            return false;
        boolean[][] opt=new boolean[s.length()+1][p.length()+1];
        
        opt[0][0]=true;
        
        for(int i=1;i<s.length()+1;i++)
            opt[i][0]=false;
        for(int i=1;i<p.length()+1;i++)
            opt[0][i]=false;
        
        int k=1;
        while(k-1<p.length() && p.charAt(k-1)=='*')
        {
            opt[0][k]=true;
            k++;
        }
        
        for(int i=1;i<s.length()+1;i++)
            for(int j=1;j<p.length()+1;j++)
            {
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?')
                    opt[i][j]=opt[i-1][j-1];
                else if(p.charAt(j-1)=='*')
                    opt[i][j]=opt[i][j-1] || opt[i-1][j];
                else
                    opt[i][j]=false;
            }
        
        return opt[s.length()][p.length()];
    }
}