public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int a=1;
        while(num>0)
        {
            num=num-a;
            a+=2;
        }
        
        if(num==0)
            return true;
        return false;
    }
}