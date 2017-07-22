/*
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].
*/
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