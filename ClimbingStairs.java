/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) 
            return 1;
        
        int[] opt = new int[n];
        opt[0] = 1;
        opt[1] = 2;
        
        for (int i = 2; i < n; i++) 
            opt[i] = opt[i-1]+opt[i-2];
    
        return opt[n-1];
    }
}