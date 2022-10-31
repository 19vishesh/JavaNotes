import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int countdigits(int C1)
            {
                int count = 0;
                while (C1>0) {
                    count++;
                    C1 = C1 / 10;
                }
                return count;
            }

    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
 
            int S = sc.nextInt();
            int[] arr = new int[S];
            for(int i = 0; i < S; i++){
                arr[i]=sc.nextInt();
            }
            //Converting to String array
            String[] arrstr = new String[arr.length];
 
            for (int i = 0; i < arr.length; i++) {
                arrstr[i] = String.valueOf(arr[i]);
            }
            Arrays.toString(arrstr);

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arrstr.length; i++) {
                sb.append(arrstr[i]);
            }
            String str = sb.toString();  //str contains the S input
            
            // --------------------------------------------------------------
            int C = sc.nextInt();
            int[] arr1 = new int[C];
            //int[] arrc = new int[C];
            for(int i = 0; i < C; i++){
                arr1[i]=sc.nextInt();
            }

            //Converting to String array
            String[] arrstr1 = new String[arr1.length];
 
            for (int i = 0; i < arr1.length; i++) {
                arrstr1[i] = String.valueOf(arr1[i]);
            }
            Arrays.toString(arrstr1);

            //StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arrstr1.length; i++) {
                sb.append(arrstr1[i]);
            }
            String str1 = sb.toString();
            //str contains the C input
            int C1 = Integer.parseInt(str1); //converted to integer
            //cyclic(C1);
                        int num = C1;
                        int n = countdigits(C1);
                        int[] arrc = new int[C];
                        
                        for(int i=0; i<=C; i++){
                            
                            arrc[i]=num; // containing the cyclic values
                            int rem = num % 10;
                            int dev = num / 10;
                            num = (int)((Math.pow(10, n - 1)) * rem + dev);

                            if (num == C1)
                                break;
                        }
            // ---------------------------------------------------------------------------
            ArrayList<Integer> arrlist = new ArrayList<Integer>();
            for(int i=0; i<S; i++){
            int index = str.indexOf(arrc[i]);
            arrlist.add(index);
        }

        System.out.println(arrlist.size());
    }
}