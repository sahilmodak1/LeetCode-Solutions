public class KeyboardRow {
    public String[] findWords(String[] words) {
        
        String s1="qwertyuiop",s2="asdfghjkl",s3="zxcvbnm";
        ArrayList<String> a=new ArrayList<>();
        
        for(int i=0;i<words.length;i++)
        {
            String x=words[i].toLowerCase();
            int flag=0;
            
            if(s1.contains(Character.toString(x.charAt(0))))
            {
                for(int j=1;j<x.length();j++)
                    if(!s1.contains(Character.toString(x.charAt(j))))
                    {
                        flag=1;
                        break;
                    }
            }
            else if(s2.contains(Character.toString(x.charAt(0))))
            {
                for(int j=1;j<x.length();j++)
                    if(!s2.contains(Character.toString(x.charAt(j))))
                    {
                        flag=1;
                        break;
                    }
            }
            else
            {
                for(int j=1;j<x.length();j++)
                    if(!s3.contains(Character.toString(x.charAt(j))))
                    {
                        flag=1;
                        break;
                    }
            }
            
            if(flag==0)
                a.add(words[i]);
        }
        
        String[] ans=new String[a.size()];
        for(int i=0;i<ans.length;i++)
            ans[i]=a.get(i);
            
        return ans;
    }
}