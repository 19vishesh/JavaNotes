import java.util.*;
import java.util.concurrent.ForkJoinPool;

/**
 * selection
 */
public class selection {

    public static void main(String[] args) {
        int[] a = {10, 3, 14, 2, 0};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] a) {
        for(int i=0; i<a.length-1; i++){
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[min])
                    min = j;
                
                swap(a,i,min);             
            }
        }
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}