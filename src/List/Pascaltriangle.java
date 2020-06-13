package List;

import java.util.ArrayList;
import java.util.List;

public class Pascaltriangle {

    public  static List<List<Integer>> pascal(int input){
        /*
        * if it is less than = 0 return
        * first is hardcoded to 1
        * we start the loop from 1 to input
        * get the prev row
        * have another loop on the prev
         */

        List<List<Integer>> res = new ArrayList<>();
        if (input <=0) return res;

        List<Integer> first =  new ArrayList<>();
        first.add(1);
        res.add(first);

        for(int k=1;k<input;k++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            List<Integer> prev = res.get(k-1);
            for(int m=0;m<prev.size()-1;m++){
                curr.add(prev.get(m)+prev.get(m+1));
            }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }

    public static void main(String args[]) {
        List<List<Integer>> res = pascal(6);
        for(List<Integer> i: res){
            for(Integer k : i){
                System.out.print(k);
            }
            System.out.println();
        }


    }
}
