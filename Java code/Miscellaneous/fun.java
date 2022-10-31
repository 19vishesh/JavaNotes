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
class fun {
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main (String[] args) {
        int a[] = {1,2,0,2,0,1}; 
        // o/p- [0, 0, 2, 2, 1, 1]
        
        int lo = 0;
        int hi = a.length-1;
        int mid = 0, temp=0;
        while (mid <= hi) {
            switch (a[mid]) {
            case 0: {
                // temp = a[lo];
                // a[lo] = a[mid];
                // a[mid] = temp;
                swap(a, lo, mid);
                lo++;
                mid++;
                break;
            }
            case 2:
                mid++;
                break;
            case 1: {
                // temp = a[mid];
                // a[mid] = a[hi];
                // a[hi] = temp;
                swap(a, hi, mid);
                hi--;
                break;
            }
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
}
