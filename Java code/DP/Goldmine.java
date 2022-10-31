// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/goldmine-official/ojquestion

import java.util.Scanner;

public class Goldmine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        for(int j=dp[0].length-1; j>=0; j--){       // Starting with the column loop
            for(int i=dp.length-1; i>=0; i--){      
                if(j==dp[0].length-1)                       // last column
                    dp[i][j] = arr[i][j];
                else if(i==0)                               // first row
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                else if(i==dp.length-1)                      // last row
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                else                              // rest of the area
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], Math.max(dp[i+1][j+1], dp[i-1][j+1]));
            }
        }
        int max = dp[0][0];
        for(int i=1; i<dp.length; i++){
                max = Math.max(dp[i][0], max);
        }
        System.out.println(max);
    }
}
