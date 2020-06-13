package SearchSort;

public class InsertionSort {
    /**
     * Iterate the list
     * virtually divide the list into sorted and unsorted
     * iterate the list
     * get the 2nd element and put it in a value and a hole to current index
     * while hole == 0 compare a[h] and a[h-1] and swap if a[h-1] < a[h]
     * reduce hole by 1
     *
     */

    public int[] sort(int[] input){
        for(int i=0;i<input.length;i++){
         int value = input[i];
         int hole = i;
         while(hole > 0){
             if(input[hole] < input[hole-1]){
                int temp = input[hole-1];
                input[hole] = temp;
                input[hole-1] = value;
             }
             hole--;
         }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = {9,3,22,9,900,787,2,1,12};
        InsertionSort o = new InsertionSort();
        int[] out = o.sort(input);
        for(int k=0;k<out.length;k++){
            System.out.printf("------------ "+out[k]);
        }
    }
}
