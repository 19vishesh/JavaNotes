// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/coin-change-combination-official/ojquestion

import java.util.Scanner;

public class CoinChangeCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) 
            arr[i] = sc.nextInt();
        
        int amt = sc.nextInt();
        int dp[] = new int[amt+1];
        dp[0] = 1;      //Storing 1 at first index for zero(na dena, na lena)
        for(int i=0; i<arr.length; i++){            // taking coin at outer loop toavoid permutation
            for(int j=arr[i]; j<dp.length; j++){
                dp[j] = dp[j] + dp[j - arr[i]];
            }
        }

        System.out.println(" ANS "+dp[amt]);
    }
}
/*
INPUT
4
2
3
5
6
7

OUTPUT
2
 */
