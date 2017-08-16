public static String LCS(char[] x,char[] y) {
        int[][] opt=new int[x.length+1][y.length+1];
        String ans="";
        
        //Code to compute OPT array
        for (int i=0; i<=x.length; i++)
        {
            for (int j=0; j<=y.length; j++)
            {
                if (i == 0 || j == 0)
                    opt[i][j] = 0;
                else if (x[i-1] == y[j-1])
                    opt[i][j] = opt[i-1][j-1] + 1;
                else
                    opt[i][j] = Math.max(opt[i-1][j], opt[i][j-1]);
            }
        }
        
        //Code to find the Longest Common Subsequence from OPT array
        int i=x.length,j=y.length;
        while(i>0 && j>0)
        {
            if(x[i-1]==y[j-1])
            {
                ans+=Character.toString(x[i-1]);
                i--;
                j--;
            }
            else if(opt[i-1][j]>opt[i][j-1])
                i--;
            else
                j--;
        }
        
        return new StringBuilder(ans).reverse().toString();
        
    }