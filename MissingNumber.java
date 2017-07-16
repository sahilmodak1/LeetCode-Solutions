public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum1=0,sum2;
        
        for(int i:nums)
            sum1=sum1+i;
        
        sum2=(nums.length*(nums.length+1))/2;
        
        return sum2-sum1;
    }
}