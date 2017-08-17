/*
Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)

You have the following 3 operations permitted on a word:

a) Insert a character
b) Delete a character
c) Replace a character
*/
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int[][] opt=new int[word1.length()+1][word2.length()+1];
        
        for(int i=0;i<word1.length()+1;i++)
            for(int j=0;j<word2.length()+1;j++)
            {
                if(i==0)
                    opt[i][j]=j;
                else if(j==0)
                    opt[i][j]=i;
                else if(word1.charAt(i-1)==word2.charAt(j-1))
                    opt[i][j]=opt[i-1][j-1];
                else
                    opt[i][j]=1+Math.min(Math.min(opt[i][j-1],opt[i-1][j]),opt[i-1][j-1]);
            }

        return opt[word1.length()][word2.length()];
    }
}