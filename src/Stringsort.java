public class Stringsort {
    public String[] sort(String[] unsorted) {
        // iterate the array
        // get the value, get the hole to current indicator
        // while compare array[hole]  to arr[hole-1] if ar[hole-1] is < arr[hole]
        //  swap it
        // reduce the counters
        for(int k=0;k<unsorted.length;k++){
            int hole = k;
            String value = unsorted[k];
            while(hole > 0){
                if(Integer.parseInt(unsorted[hole-1]) < Integer.parseInt(unsorted[hole])){
                    String temp = unsorted[hole-1];
                    unsorted[hole-1] = value;
                    unsorted[hole] = temp;
                }
                hole--;
            }
        }
        for(int k=0;k<unsorted.length;k++){
            System.out.println(unsorted[k]);
        }
        return unsorted;
    }
    public static void main(String[] args) {
        String[] input = {"1","5","3149"};
        Stringsort o = new Stringsort();
        String[] out = o.sort(input);
        for(int k=0;k<out.length;k++){
            System.out.printf("------------ "+out[k]);
        }
    }
}
