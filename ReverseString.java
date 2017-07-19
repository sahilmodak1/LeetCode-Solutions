public class ReverseString {
    public String reverseString(String s) {
     
     char[] a=s.toCharArray();
        char temp;
        for(int i=0;i<a.length/2;i++)
        {
            temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        
        return(String.valueOf(a));
    }
}