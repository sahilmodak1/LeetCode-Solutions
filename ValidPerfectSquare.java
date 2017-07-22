/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True


Example 2:

Input: 14
Returns: False
*/
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