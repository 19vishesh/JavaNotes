import javax.lang.model.util.ElementScanner14;

public class PairExist {
    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int x = -2;
 
        if (chkPair(arr, x)) 
            System.out.println("Yes");       
        else
            System.out.println("No");        
    }

    public static boolean chkPair(int[] arr, int x){
        int l = 0;
        int r = arr.length-1;

        while(l<r){
            if(arr[l]+arr[r]==x)
                return true;
            else if(arr[l]+arr[r]>x)
                l++;
            else
                r++;
        }
        return false;
    }
}
