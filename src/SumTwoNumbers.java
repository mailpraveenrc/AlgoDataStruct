import java.util.HashSet;
import java.util.Set;

public class SumTwoNumbers {

            public static int[] twoNumberSum(int[] array, int targetSum) {
                
                Set<Integer> set = new HashSet<>();
                for (int i = 0; i < array.length; i++) {
                    int secondint = targetSum - array[i];
                    if(set.contains(secondint)){
                        return new int[]{array[i],secondint};
                    }else{
                        set.add(array[i]);
                    }
                }
                throw new IllegalArgumentException("No two sum solution");

            }

public static  void  main(String args[]){
    int[] a = {-1,0,-45,5,8,5000};
    System.out.println("-----------------"+twoNumberSum(a,13));
}
}
