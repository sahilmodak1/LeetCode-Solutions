public class RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        
        int r = m, c = n;
        for(int[] arr : ops) 
        {
            
            r = Math.min(r, arr[0]);
            c = Math.min(c, arr[1]);
        }
        
        return r*c;
    }
}