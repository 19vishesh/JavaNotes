// The main difference between between 0/1 knapsack and unbounded knapsack is
// in 0/1 knapsack there is 2 option for every weights. either it will go in the bag or not,(not go multiple times). {2-D dp}
// in unbounded there is no restriction, same weights can go in the bag multiple times. {1-D dp}

// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/unbounded-knapsack-official/ojquestion

import java.util.Scanner;

public class KnapsackUnbounded {
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
        int[] dp = new int[capacity+1];
        dp[0] = 0;

        for(int bagc=1; bagc<dp.length; bagc++){
            int max = 0;
            for(int j=0; j<n; j++){

                if(wts[j] <= bagc){
                    int remBagc = bagc - wts[j];
                    int remBagv = dp[remBagc];
                    int totalBagv = remBagv + vals[j];

                    if(totalBagv > max)
                        max = totalBagv;
                }
            }
            dp[bagc] = max;
        }
        System.out.println(dp[capacity]);
    }
}


/*
Sample Input
5
15 14 10 45 30
2 5 1 3 4
7

Sample Output
100
*/