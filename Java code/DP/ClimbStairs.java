// You are climbing a staircase. It takes 'N' steps to reach the top.
// Each time you can either climb 1 or 2 steps. 
// In how many distinct ways can you climb to the top?

import java.util.*;

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 2; //stairs
        System.out.println(countPath(n, new int[n+1]));
        System.out.println(countPathTabular(n));

    }

    private static int countPathTabular(int n) {
        int[] dp = new int[n+1];
        
        dp[0] = 1;
        for(int i=1; i<=n; i++){
            if(i==1)
                dp[i] = dp[i-1];
            else
                dp[i] = dp[i-1] + dp[i-2];
        }        
        return dp[n];
    }

    private static int countPath(int n, int[] dp) {
        if(n==0)
            return 1;
        else if (n<0)
            return 0;

        if(dp[n]>0)
            return dp[n];

        int count = countPath(n-1, dp) + countPath(n-2, dp);
        dp[n] = count;
        
        return count;
    }
}
