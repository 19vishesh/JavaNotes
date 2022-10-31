import java.util.*;
import java.lang.*;
import java.io.*;


class dsd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums = {-2,9,2,5,-33,7,101,18};
		System.out.print(lengthOfLIS(nums));
	}
    public static int lengthOfLIS(int[] nums) {
        // ArrayList<Integer> sub = new ArrayList<>();
        // sub.add(nums[0]);
        int[] res = new int[nums.length];
        int k = 0;
        res[k++] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > res[k - 1]) {
                res[k++] = num;//2 3 7 101  
            } else {
                int j = binarySearch(res, num, k);
                res[j] = num;//2
            }
            
        }
        System.out.println(Arrays.toString(res));
        return k;
    }
    
    private static int binarySearch(int[] res, int num,int k) {
        int left = 0;
        int right = k - 1;
        // int mid = (left + right) / 2;
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (res[mid] == num) {
                return mid;
            }
            
            if (res[mid] < num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
}