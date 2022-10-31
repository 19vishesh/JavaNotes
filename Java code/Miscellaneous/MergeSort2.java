import java.util.*;


public class MergeSort2 {
    public static void main(String[] args) {
        int[] a = {1,5,89,1,5,5,55,8,66,4};
        
        mergesort(a);
        // System.out.println(Arrays.toString(a));
    
    }
    static int[] mergesort(int[] a) {
        if(a.length==1){
            return a;
        } 
        int mid = a.length/2;

        int[] left = mergesort(Arrays.copyOfRange(a,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(a,mid+1,a.length));
        return merge(left, right);

    }
    static int[] merge(int[] left, int[] right) {
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
