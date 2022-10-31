import java.io.*; // for handling input/output
import java.util.*;
import java.lang.*;
/**
 * frquencyofelement
 */
public class frquencyofelement {

    public static void main(String[] args) {
        int arr[] = {2,1,-4,2,56,-4,2,3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        for(HashMap.Entry<Integer, Integer> ent : map.entrySet()){
            System.out.println(ent.getKey()+" "+ent.getValue());
        }
    }
}