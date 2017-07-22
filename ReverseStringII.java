/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
*/
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] a=s.toCharArray();
        int m,n;
        char temp;
        
        for(int i=0;i<a.length;i+=(2*k))
        {
            m=i;
            n=i+k-1;
            
            if(n>s.length()-1)
                n=s.length()-1;
            
            for(int j=m;j<(m+n+1)/2;j++)
            {
                temp=a[j];
                a[j]=a[(m+n+1)-(j+1)];
                a[(m+n+1)-(j+1)]=temp;
            }
        }
        
        return new String(a);
    }
}