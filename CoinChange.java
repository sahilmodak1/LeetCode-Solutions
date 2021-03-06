/*
You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:
coins = [1, 2, 5], amount = 11
return 3 (11 = 5 + 5 + 1)

Example 2:
coins = [2], amount = 3
return -1.

Note:
You may assume that you have an infinite number of each kind of coin.
*/
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] opt=new int[amount+1];
        Arrays.fill(opt,999999);
            
        opt[0]=0;
        
        for(int j=0;j<coins.length;j++)
            for(int i=1;i<opt.length;i++)
                if(i>=coins[j])
                    opt[i]=Math.min(opt[i],1+opt[i-coins[j]]);

        return opt[opt.length-1]!=999999?opt[opt.length-1]:-1;
    }
}