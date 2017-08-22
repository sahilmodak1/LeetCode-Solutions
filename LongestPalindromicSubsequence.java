/*
Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:
4
One possible longest palindromic subsequence is "bbbb".

Example 2:
Input:

"cbbd"
Output:
2
*/
public class LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        int[][] opt=new int[s.length()][s.length()];
        
        for(int k=0;k<s.length();k++)
            for(int i=0,j=k;i<s.length() && j<s.length();i++,j++)
            {
                if(i==j)
                    opt[i][j]=1;
                else if(s.charAt(i)!=s.charAt(j))
                    opt[i][j]=Math.max(opt[i][j-1],opt[i+1][j]);
                else if(s.charAt(i)==s.charAt(j))
                    opt[i][j]=2+opt[i+1][j-1];  
            }
        
        return opt[0][s.length()-1];
    }
}