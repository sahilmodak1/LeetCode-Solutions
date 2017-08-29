/*
Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true
*/
class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if(s.equals(p))
            return true;
        
        
        boolean[][] opt=new boolean[s.length()+1][p.length()+1];
        
        opt[0][0]=true;
        
        for(int i=1;i<s.length()+1;i++)
            opt[i][0]=false;
        for(int i=1;i<p.length()+1;i++)
            opt[0][i]=false;
        
        int k=2;
        while(k<p.length()+1 && p.charAt(k-1)=='*')
        {
            opt[0][k]=true;
            k+=2;
        }
        
        for(int i=1;i<s.length()+1;i++)
            for(int j=1;j<p.length()+1;j++)
            {
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='.')
                    opt[i][j]=opt[i-1][j-1];
                else if(p.charAt(j-1)=='*')
                {
                    if(opt[i][j-2]==true)
                        opt[i][j]=true;
                    else if(s.charAt(i-1)==p.charAt(j-2) || p.charAt(j-2)=='.')
                        opt[i][j]=opt[i][j-2] || opt[i-1][j];
                }
                else
                    opt[i][j]=false;
            }
        
        return opt[s.length()][p.length()];
    }
}