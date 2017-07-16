public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        int[] temp=new int[rowIndex+1];
        temp[0]=1;
        for(int i=1; i<rowIndex+1; i++)
           for(int j=i; j>=1; j--)
               temp[j]+=temp[j-1];
       
        
        for(int i:temp)
            ans.add(i);
        return ans;
    }
}