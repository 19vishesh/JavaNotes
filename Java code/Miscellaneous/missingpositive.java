import java.util.*;

class missingpositive{
    public static void main(String[] args) {
        int[] arr = {-1, 3, 2, 4, 1, 6, 89};

        Arrays.sort(arr);
        int ans = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ans)
                ans++;
        }
        System.out.println(ans); 
    }
}