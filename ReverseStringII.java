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