// counting of the length of the binary string with no consecutive zeroes will occur together
// like 11101010, 10110101, not 10011010, 1000110

// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/count-binary-strings-official/ojquestion

import java.util.Scanner;

public class CountBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // length of the string
        
        UsingArraySolution(n);
        UsingVariableSolution(n);
    }

    private static void UsingArraySolution(int n) {
        int[] dp0 = new int[n+1];
        int[] dp1 = new int[n+1];

        dp0[1] = 1;     // Since there should be zero in first index, and it is always true for 1st index have value 1
        dp1[1] = 1;
        for (int i = 2; i <= n; i++){
            dp0[i] = dp1[i-1];
            dp1[i] = dp0[i-1] + dp1[i-1];
        }

        System.out.println(dp0[n]+dp1[n]);
    }

    private static void UsingVariableSolution(int n) {
        int oldZeroCount = 1;
        int oldOneCount = 1;

        for (int i = 2; i <= n; i++) {
            int newZeroCount = oldOneCount;
            int newOneCount = oldOneCount + oldZeroCount;

            oldZeroCount = newZeroCount;
            oldOneCount = newOneCount;
        }
        System.out.println(oldOneCount + oldZeroCount);
    }
}
