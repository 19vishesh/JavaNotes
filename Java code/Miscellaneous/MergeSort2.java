import java.util.*;


public class MergeSort2 {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        
        a = mergesort(a);
        System.out.println(Arrays.toString(a));
    
    }
    public static int[] mergesort(int[] a) {
        if(a.length==1){
            return a;
        } 
        int mid = a.length/2;

        int[] left = mergesort(Arrays.copyOfRange(a,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(a,mid,a.length));
        return merge(left, right);

    }
    public static int[] merge(int[] left, int[] right) {
        int i=0, j=0, k=0;
        int[] res = new int[left.length+right.length];

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                res[k]=left[i];
                i++;
            }else{
                res[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            res[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            res[k]=right[j];
            j++;
            k++;
        }
        return res;
    }   
    
}
