import java.io.*; // for handling input/output
import java.util.*;
import java.lang.*;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,8,336,-5,4};

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 1; j < arr.length - i; j++)
                if (arr[j] < arr[j - 1]) {
                    // swap arr[j+1] and arr[j]

                    swap(arr,j,j-1);
                }
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}
