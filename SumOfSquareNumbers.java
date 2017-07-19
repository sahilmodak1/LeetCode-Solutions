public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        HashSet<Integer> hset1 = new HashSet<Integer>();
        
        for (int j=0; j<=Math.sqrt(c);j++) 
        {
            hset1.add(j*j);
            if (hset1.contains(c-j*j)) 
                return true;
        }
        return false;
    }
}