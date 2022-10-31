import java.io.*;
import java.lang.*;
import java.util.*;

class threeSum{
    static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 6, 9};
        int target = 24;
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            int j= i+1;
            int k= arr.length-1;
            if(i>0 && arr[i]==arr[i-1])
                continue;

            while(j<k){
                if(k<arr.length-1 && arr[k]==arr[k+1])
                    continue;
                
                if(arr[i]+arr[j]+arr[k]>target)
                    k--;
                else if(arr[i]+arr[j]+arr[k]<target)
                    j++;
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]); list.add(arr[j]); list.add(arr[k]);
                    res.add(list);
                    j++;
                    k--;
                }
            }
        }System.out.println(res);
    }  
}
