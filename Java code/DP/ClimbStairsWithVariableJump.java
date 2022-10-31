// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-with-variable-jumps-official/ojquestion

public class ClimbStairsWithVariableJump {
    public static void main(String[] args) {
        
        int arr[] = {3,3,0,2,1,2,4,2,0,0};
        int n = arr.length; 
        int dp[] = new int[arr.length+1];

        dp[n] = 1;
        for (int i=n-1; i>=0; i--) {
            for(int j=1; j<=arr[i] && i+j<dp.length; j++){
                dp[i] = dp[i] + dp[i+j];
            }           
        }
        System.out.println(dp[0]);

    }
}

