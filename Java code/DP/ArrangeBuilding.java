// This is similar kind problem as Binary Digits but in this case
// we have to tak ethe square of the total as there can be different ways to put the buildings.

// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/arrange-buildings-official/ojquestion


import java.util.Scanner;

public class ArrangeBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // number of building to be arranged
        
        // UsingArraySolution(n);
        UsingVariableSolution(n);
    }

    private static void UsingVariableSolution(int n) {
        int oldBuilding = 1;
        int oldSpace = 1;

        for (int i = 2; i <= n; i++) {
            int newBuilding = oldSpace;
            int newSpace = oldSpace + oldBuilding;

            oldBuilding = newBuilding;
            oldSpace = newSpace;
        }
        long total = oldBuilding + oldSpace;
        System.out.println(total * total);
        // System.out.println((long)Math.pow(total, 2));
    }    
}
