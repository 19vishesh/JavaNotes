import java.io.*;
import java.util.*;

public class secondHighest {
    public static void main(String[] args) {
        int[] a = {1,5,4,8,6,5,33,2,112,23,32,-8};
        System.out.println("Second highest "+res(a));
        int max = Integer.MIN_VALUE;
        for (int i : a) {
            max = Math.max(max, i); 
        }
        System.out.println("Maximum "+max);

        int min = Integer.MAX_VALUE;
        for (int i : a) {
            min = Math.min(min, i); 
        }
        System.out.println("Minimum " +min);
        
    }

    private static int res(int[] a) {
        if(a.length==1){
            return 1;
        }
        if(a.length==0){
            return 0;
        }
        Arrays.sort(a);
        return a[a.length-2];
    }
}
