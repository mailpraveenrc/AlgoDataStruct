import java.math.*;
import java.text.*;
import java.util.*;
public class Posnegzeroratio {


    private static DecimalFormat df = new DecimalFormat("#.######");
    static void plusMinus(int[] arr) {
        int pos =0;
        int neg =0;
        int zero =0;
        double d_pos ;
        double d_neg ;
        double d_zero ;
        for(int k=0;k<arr.length;k++){
            if(arr[k] > 0){
                pos = pos+1;
            }
            else if(arr[k] < 0){
                neg = neg+1;
            }
            else{
                zero = zero+1;
            }
        }
        int size = arr.length;
        d_pos = (double)pos/arr.length;
        d_neg = (double)neg/arr.length;
        d_zero = (double)zero/arr.length;
        System.out.println(df.format(d_pos));
        System.out.println(df.format(d_neg));
        System.out.println(df.format(d_zero));
    }

    public static void main(String[] args) {
        int[] input = {0,9,-1};
        Posnegzeroratio.plusMinus(input);
     }

}
