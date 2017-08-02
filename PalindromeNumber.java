/*
Determine whether an integer is a palindrome. Do this without extra space.
*/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        
        int n=x;
        int d=0;
        while(n!=0)
        {
            d=d*10+n%10;
            n=n/10;
        }
        
        return (d==x)?true:false;
    }
}