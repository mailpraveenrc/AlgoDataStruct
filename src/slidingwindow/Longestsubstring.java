package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class Longestsubstring {
    public static int find(String s) {
        int a_window = 0;
        //int b_window =0;
        int max = 0;
        Set<Character> alpha = new HashSet<>();
        for (int b_window = 0; b_window < s.length(); b_window++) {
            if (!alpha.contains(s.charAt(b_window))) {
                alpha.add(s.charAt(b_window));
                max= Math.max(max,alpha.size());
            } else {
                alpha.remove(s.charAt(a_window));
                a_window++;

            }
        }


        return max;
    }

    public static void main(String args[]){
        System.out.println(find("abbb"));
    }
}
