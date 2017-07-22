/*
Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"

Example 2:
Input: -7
Output: "-10"
*/


public class Base7 {
    public String convertToBase7(int num) {
        String ans1="";
        int num1=num;
        
        if(num==0)
            return "0";
        
        while(num!=0)
        {
            //ans=ans*10+nums%7;
            ans1+=Integer.toString(Math.abs(num%7));
            num=num/7;
        }
        
        if(num1<0)
            ans1+="-";
        
        return (new StringBuilder(ans1).reverse().toString());
    }
}