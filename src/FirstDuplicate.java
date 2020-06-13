import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
static Integer firstduplicate(int[] input){
    Set<Integer> s = new HashSet<>();
    for(int k=0;k<input.length;k++){
        if(s.contains(input[k])){
            return  input[k];
        }
        s.add(input[k]);
    }
    return null;

}

    public static void main(String args[]) {
        int[] a= {1,2,3,4,4,4,5,5};
        System.out.println(firstduplicate(a));
    }
}
