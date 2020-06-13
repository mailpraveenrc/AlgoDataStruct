import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SubString {
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;

        Set<Object> res = new HashSet<Object>();
        Set<Integer> resC = new HashSet<Integer>();
        int count =0;
        int maxcount =0;
        String res2 ="";
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                res2 = res2+"#";
            }else{
                res2 = res2+s.charAt(i);
            }
        }
        /*
        * i =0 k=0 maxcount =0 add elements in a set if it does not exist
        * increment i if you find a duplicate  stop i sub i-k put it in set
        * increment k
        *
        *
        *
         */
        int i=0;
        int k =0;
        while(i < res2.length()) {
            if(res.contains(res2.charAt(i))){
                k++;
            }else{
                res.add(res2.charAt(i));
            }
            i++;
        }

        if(resC != null && resC.size() > 0){
            maxcount = Collections.max(resC);
        }
        return maxcount;
    }

    public static int brutforce(String s) {
                if(s == null || s.length() == 0) return 0;

                Set<Object> res = new HashSet<Object>();
                Set<Integer> resC = new HashSet<Integer>();
                int count =0;
                int maxcount =0;
                String res2 ="";
                for(int i =0;i<s.length();i++){
                    if(s.charAt(i) == ' '){
                        res2 = res2+"#";
                    }else{
                        res2 = res2+s.charAt(i);
                    }
                }

                for(int k=0;k<res2.length();k++){
                    for(int m=0;m<res2.length();m++){
                        res = new HashSet<>();
                        for(int i =m;i<=k;i++){
                            if(res.contains(res2.charAt(i))){
                                resC.add(count);
                                count = 0;
                                res = new HashSet<>();
                                res.add(res2.charAt(i));
                                count++;
                            }else{
                                res.add(res2.charAt(i));
                                count++;
                                resC.add(count);
                            }
                        }
                    }
                }
                if(resC != null && resC.size() > 0){
                    maxcount = Collections.max(resC);
                }
                return maxcount;
    }



    public static void main(String[] args) {
        String out = "ab";
        System.out.println("------------"+brutforce(out));
    }

}
