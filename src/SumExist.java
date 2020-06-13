import java.util.HashSet;
import java.util.Set;

public class SumExist {

    static boolean checksumExist(int[] a,int[] b,int v) {
        Set<Integer> s = new HashSet<>();
        for (int k = 0; k < a.length; k++) {
            s.add(a[k]);
        }

        for (int k = 0; k < b.length; k++) {
if(s.contains(v-b[k])){
    return  true;
}
        }
return false;
    }

public static  void  main(String args[]){
    int[] a = {-1,0,-45,5,8,5000};
    int[] b = {-11,0,-45,5,81,51000};
    System.out.println("-----------------"+checksumExist(a,b,-900));
}
}
