import java.util.Scanner;

// Check subArray and subSet of array
// ex : arr[]{1,2,3,4,5}
//subarray = 1,2,3 OR 4,5  any continuous
// subset = 1,4,2 OR 1,3,5 any random

// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/target-sum-subsets-dp-official/ojquestion

class TargetSumSubarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) 
            arr[i] = sc.nextInt();
        
        int target = sc.nextInt();
        boolean[][] dp = new boolean[n+1][target+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){  //now we will have 4 conditions
                if(i==0 && j==0)
                    dp[i][j] = true;
                else if(i==0)       // this will make (0,0) as false and then next line will make it true again so not adding cond. (j!=0)
                    dp[i][j] = false;
                else if(j==0)
                    dp[i][j] = true;
                else{
                    if(dp[i-1][j]==true){
                        dp[i][j] = true;
                    }else{
                        int val = arr[i-1];         // var is array element
                        if(j >= val){
                            if(dp[i-1][j-val] == true)
                                dp[i][j] = true;
                        }
                    } 
                }                       
            }
        }
        System.out.println(dp[arr.length][target]);
    }
}
