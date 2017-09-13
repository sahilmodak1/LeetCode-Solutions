/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"
*/
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();  

        boolean opt[][] = new boolean[n][n];
 
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            opt[i][i] = true;
 
        // check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                opt[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
         
        for (int k = 3; k <= n; ++k)      
            for (int i=0; i<n-k+1; ++i) 
            {
                int j=i+k-1;
                
                if (opt[i+1][j-1] && s.charAt(i) == s.charAt(j)) 
                {
                    opt[i][j] = true;
 
                    if (k > maxLength) 
                    {
                        start=i;
                        maxLength=k;
                    }
                }
            }
    
        return s.substring(start,start+maxLength);

    }
}