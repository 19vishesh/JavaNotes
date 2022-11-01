// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/zero-one-knapsack-official/ojquestion

import java.util.Scanner;

public class KnapsackZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] vals = new int[n];        // values
        int[] wts = new int[n];         // weights
        for (int i = 0; i < vals.length; i++) 
            vals[i] = sc.nextInt();
        for (int i = 0; i < wts.length; i++) 
            wts[i] = sc.nextInt();


        int capacity = sc.nextInt();
        int[][] dp = new int[n+1][capacity+1];
        
        for(int i=1; i<dp.length; i++){
            for (int j = 1; j < dp[0].length; j++) {
                if(j >= wts[i-1]){
                    int remCapacity = j - wts[i-1];

                    if(vals[i-1] + dp[i-1][remCapacity] > dp[i-1][j])
                        dp[i][j] = vals[i-1] + dp[i-1][remCapacity];
                    else
                        dp[i][j] = dp[i-1][j];      // when i doesn't bat
                }
                else
                    dp[i][j] = dp[i-1][j];      // when i doesn't bat               
            }
        }
        System.out.println(dp[n][capacity]);
    }
}
/*
Sample Input
5
15 14 10 45 30
2 5 1 3 4
7
Sample Output
75
 */