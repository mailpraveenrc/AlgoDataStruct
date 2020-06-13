package DynamicRecursion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * "0" - 0
 * "1" - returm
 * "26" - af and z
 * "265" - af + others z + othersaaaaaaasaaaaa
 */
public class DecodeNumbers {

    Map<Integer,Integer> map = new HashMap<>();

    private int dp_decode(String s,int pos){
        int result =0;

        if(pos == s.length()) return 1;

        if(pos == s.length()-1) return 1;

        if(s.charAt(pos) == '0') return 0;

        result += dp_decode(s,pos+1);
        if(pos != s.length()-1){
            if(Integer.parseInt(s.substring(pos,pos+2)) <= 26) {
                result += dp_decode(s, pos + 2);
            }
        }


        return result;
    }

public static void main (String args[]){
        DecodeNumbers o = new DecodeNumbers();
        long startTime = System.nanoTime();
        System.out.println(o.dp_decode("123456789876",0));

        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns");
}
}
