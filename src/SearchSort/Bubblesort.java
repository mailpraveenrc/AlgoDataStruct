package SearchSort;

public class Bubblesort {
    public int[] sort(int[] input){
        //  compare adjacent elements and swap the largest element to last
        // iterate i do the above step
        // have another loop k-i

        for(int i=0;i<input.length;i++){
            for(int k=0;k<input.length-i-1;k++){
               if(input[k+1] <input[k]){
                   int tempfirst = input[k];
                   int tempsecond = input[k+1];
                   input[k] = tempsecond;
                   input[k+1] = tempfirst;
               }
            }
        }
        return  input;
    }
    public static void main(String[] args) {
        int[] input = {7,3,2,1000,1,9,44,88};
        Bubblesort o = new Bubblesort();
        int[] out = o.sort(input);
        for(int k=0;k<out.length;k++){
            System.out.printf("------------ "+out[k]);
        }
    }
}
