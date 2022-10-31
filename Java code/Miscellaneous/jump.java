import java.io.*; // for handling input/output
import java.lang.reflect.Array;
import java.util.*; // contains Collections framework


//import java.math.*;
class jump {
    public static void main (String[] args) {
        int a[] = {1,2,0,0,1};
        
        int lo = 0;
        int hi = a.length-1;
        int mid = 0, temp=0;
        while (mid <= hi) {
            switch (a[mid]) {
            case 0: {
                temp = a[lo];
                a[lo] = a[mid];
                a[mid] = temp;
                lo++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2: {
                temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
}
