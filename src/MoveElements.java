import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoveElements {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int a =0;
        int b = array.size() - 1;
        while(a < b){
            if (array.get(a) == toMove){
    //            array.get(a) = array.get(b);
    //            array.get(b) = toMove;
                a++;
            }
            a++;
        }
        return array;
    }

    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        boolean isDesc = false;
        boolean isAsc = false;
        for(int i =0;i< array.length;i++){
            if(i != array.length-1){
                if(array[i] < array[i+1]){
                    isDesc = true;
                }else{
                    isDesc = false;
                }
                if(array[i] > array[i+1]){
                    isAsc = true;
                }else{
                    isAsc = false;
                }
            }
        }
        if (isAsc== false && isDesc == false){
            return true;
        }else{
            return false;
        }
    }



    public static void main(String args[]){
        List<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(1);
        moveElementToEnd(input,2);
        int[] arr = new int [] {1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        System.out.println("----------------"+isMonotonic((arr)));
    }
}
