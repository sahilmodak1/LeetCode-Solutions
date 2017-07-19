public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if(num<=0)
            return false;
        
        int ans = 0;
        
        for (int i=1; i*i<=num;i++) 
        {
            if (num%i==0)
            { 
                ans+=i;
                
                if (i*i!=num) 
                    ans+=num/i;
            }
        }
        if(ans-num==num)
            return true;
        
        return false;
    }
}