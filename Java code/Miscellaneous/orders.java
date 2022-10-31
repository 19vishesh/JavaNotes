import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.io.*; // for handling input/output
import java.util.*;
import java.lang.*;


//import java.math.*;
class orders {
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main (String[] args) {
        int a[] = {1,2,0,0,1};
        
        int lo = 0;
        int hi = a.length-1;
        int mid = 0, temp=0;
        while (mid <= hi) {
            switch (a[mid]) {
            case 0: {
                
                swap(a, lo, mid);
                lo++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2: {
                
                swap(a, hi, mid);
                hi--;
                break;
            }
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
}
