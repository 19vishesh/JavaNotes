import java.util.*;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};

        System.out.println(solution(str));
    }

    public static String solution(String[] str) {
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while(str[i].indexOf(prefix)!=0){
                // System.out.println(str[i].indexOf(prefix));
                prefix = prefix.substring(0, prefix.length()-1);}
        }
        return prefix;
    }
}