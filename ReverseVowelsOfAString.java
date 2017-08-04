/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
*/
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] a=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        char temp;
        
        while(i<j)
        {
            while(i<j && (a[i]!='a' && a[i] !='e' && a[i]!='i' && a[i]!='o' && a[i]!='u' && a[i] !='A' && a[i]!='E' && a[i]!='I' && a[i]!='O' && a[i] !='U'))
                i++;
            while(i<j && (a[j]!='a' && a[j] !='e' && a[j]!='i' && a[j]!='o' && a[j]!='u' && a[j] !='A' && a[j]!='E' && a[j]!='I' && a[j]!='O' && a[j] !='U'))
                j--;
            
            
            
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            
            i=i+1;
            j=j-1;
            
        }
        
        return new String(a);
    }
}