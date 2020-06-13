package SearchSort;

public class Selectionsort {
    public int[] sort(int[] input){
        // create another array of same size
        // identify the lowets element and push it in new array
        // replace the source element with 2 - 32-1
        // incremenet the destination counter
        int[] output = new int[input.length];
                for(int i=0;i<input.length;i++) {
                    int low = input[i];
                    System.out.println(low);
                    int lowindicator =i;
                    for (int j = 0; j < input.length; j++) {
                        if (input[j] < low){
                            low = input[j];
                            lowindicator = j;
                        }
                    }
                    input[lowindicator] = 327500;
                    output[i] = low;
                }
    return output;
    }
    public static void main(String[] args) {
        int[] input = {9,3,22,2,1,12};
        Selectionsort o = new Selectionsort();
        int[] out = o.sort(input);
        for(int k=0;k<out.length;k++){
            System.out.printf("------------ "+out[k]);
        }
    }
}
