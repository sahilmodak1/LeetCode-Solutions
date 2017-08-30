/*
Count the number of prime numbers less than a non-negative number, n.
*/
class CountPrimes {
    public int countPrimes(int n) {
        boolean[] ans=new boolean[n+1];
        for(int i=0;i<ans.length;i++)
            ans[i]=true;
            
        for(int i=2;i<Math.sqrt(n);i++)
            if(ans[i]==true)
                for(int j=i*i;j<=n;j+=i)
                    ans[j]=false;
        
        int count=0;
        for(int i=2;i<n;i++)
            if(ans[i])
                count++;
        
        return count;
        
    }
}