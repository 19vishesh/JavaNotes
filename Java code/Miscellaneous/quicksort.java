import java.util.*;

public class quicksort{
    public static void swap(int[] arr, int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
    public static void sort(int[] arr, int low, int high){
        if(low>=high)
            return;
        
        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = arr[mid];
        
        while(start<=end){
            while(arr[start]<pivot)
                start++;
            while(arr[end]>pivot)
                end--;
            if(start<=end){
                swap(arr, start, end);
                start++;end--;
            }
        }
        sort(arr, low, end);
        sort(arr, start, high);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,4,6,2,5,46,5,0};
        sort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}