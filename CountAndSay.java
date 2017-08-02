public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        
        String temp="1";
        for(int i=1;i<n;i++)
        {
            //System.out.println(temp);
            String prev="";
            char[] a=temp.toCharArray();
            int j=0;
            while(j<a.length)
            {
                int k=0;
                while(j<a.length-1 && a[j]==a[j+1])
                {
                    k++;
                    j++;
                }
                j++;
                prev+=Integer.toString(++k)+Character.toString(a[j-1]);
              
            }
            
            temp=prev;
        }
        
        return temp;
    }
}