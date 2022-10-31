import java.util.Scanner;

public class minimumCostPath {
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

        // int n = 2, m = 2;

        int[][] dp = new int[n][m];
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if (i == dp.length - 1 && j == dp[0].length - 1)
                    dp[i][j] = arr[i][j];
                else if (i == dp.length - 1)
                    dp[i][j] = arr[i][j] + dp[i][j + 1];
                else if (j == dp[0].length - 1)
                    dp[i][j] = arr[i][j] + dp[i + 1][j];
                else
                    dp[i][j] = arr[i][j] + Math.min(dp[i][j + 1], dp[i + 1][j]);

            }
        }
        System.out.println(dp[0][0]);
    }
}

/*
INPUT
6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1

OUTPUT
23
 */