public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        String[] ans;
        int index=Integer.MAX_VALUE;
    
        List<String> a=new ArrayList<>();
        List<String> b=new ArrayList<>();
        List<String> c=new ArrayList<>();
        
        for(String x:list1)
            a.add(x);
        for(String x:list2)
            b.add(x);
        
        for(String x:a)
            if(b.contains(x))
            {
                if(a.indexOf(x)+b.indexOf(x)<index)
                {
                    c=new ArrayList<>();
                    c.add(x);
                    index=a.indexOf(x)+b.indexOf(x);
                }
                else if(a.indexOf(x)+b.indexOf(x)==index)
                    c.add(x);
            }
        
        ans=new String[c.size()];
        for(int i=0;i<c.size();i++)
            ans[i]=c.get(i);
        
        return ans;
    }
}