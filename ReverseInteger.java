public class ReverseInteger {
    public int reverse(int x) {
        int ans=0,d,y,ans1=0;
        y=Math.abs(x);
        
        while(y!=0)
        {
            d=y%10;
            ans1=ans*10+d;
            if((ans1-d)/10 != ans)
                return 0;
            ans=ans1;
            y=y/10;
        }
        
        
        return x>0 ? ans:(ans*-1);
    }
}