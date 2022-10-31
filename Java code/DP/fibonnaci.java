import java.util.*;

class fibonnaci{
    public static void main(String[] args) {
        int n = 43;
        
        System.out.println(fiboMemoization(n, new int[n+1]));
        System.out.println(fibo(n));
        
    }
    public static int fibo(int n){
        if(n==0 || n==1)
            return n;

        return (fibo(n-1)+fibo(n-2));
    }
    public static int fiboMemoization(int n, int[] dp){
        if(n==0 || n==1)
            return n;
        if(dp[n]!=0)
            return dp[n];
        
        int fibSum = fiboMemoization(n-1, dp) + fiboMemoization(n-2, dp);
        dp[n] = fibSum;

        return fibSum;
    }
}