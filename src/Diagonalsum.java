import java.util.ArrayList;
import java.util.List;

public class Diagonalsum {

    public static int diagonalDifference(List<List<Integer>> arr) {
        List<List<Integer>> arr2 = arr;
        int res =0;
        int res2 =0;
        int maxsize =0;
        for(int k=0;k<arr.size();k++){
            List<Integer> inList = arr.get(k);
            if(inList.size() > maxsize){
                maxsize = inList.size();
            }
        }
        for(int k=0;k<arr.size();k++){
            List<Integer> inList = arr.get(k);
            if(inList.size() != maxsize){
                arr2.remove(k);
            }
        }



        for(int k=0;k<arr2.size();k++){
            List<Integer> inList = arr2.get(k);
            for(int m=0;m<inList.size();m++){
                if(m == k){
                    res = res+inList.get(k);
                }
                if(arr2.size()-k-1 == m){
                    res2 = res2+inList.get(arr2.size()-k-1);
                }
            }
        }

        if(res2 >res){
            return res2 - res;
        }else{
            return res - res2;
        }

    }
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> s1 = new ArrayList<>();
        s1.add(3);

        List<Integer> s2 = new ArrayList<>();
        s2.add(11);
        s2.add(2);
        s2.add(4);

        List<Integer> s3 = new ArrayList<>();
        s3.add(4);
        s3.add(5);
        s3.add(6);

        List<Integer> s4 = new ArrayList<>();
        s4.add(10);
        s4.add(8);
        s4.add(-12);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        int p = Diagonalsum.diagonalDifference(arr);
        System.out.println("-------------"+p);
    }

}
