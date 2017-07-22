/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
*/
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
       String[] a=s.split(" ");
        StringBuilder s1;
        String ans="";
        
        for(int i=0;i<a.length;i++)
        {
            s1=new StringBuilder(a[i]).reverse();
            ans+=s1+" ";
        }
        
        
        return(ans.substring(0,ans.length()-1));
    }
}