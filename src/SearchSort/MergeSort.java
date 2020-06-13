package SearchSort;

public class MergeSort {

    public static int[] mergesort(int[] input){
        if (input.length <2) return  input;

        int median = (input.length)/2;

        int[] leftarr = new int[median];
        int[] rightarr = new int[input.length-median];

        for(int i=0;i<leftarr.length;i++){
            leftarr[i] = input[i];
        }

        for(int i=median;i<input.length;i++){
            rightarr[i-median] = input[i];
        }
        mergesort(leftarr);
        mergesort(rightarr);
        input = sort(leftarr,rightarr,input);
        return input;
    }

    public static int[] sort(int[] a,int[] b,int[] output){
        int i =0;
        int k =0;
        int m =0;
        while(i < a.length && k <b.length){
            if(a[i] < b[k]){
                output[m] = a[i];
                i++;
            }else{
                output[m] = b[k];
                k++;
            }
            m++;
        }
        while(i < a.length){
            output[m] = a[i];
            i++;
            m++;
        }
        while(k < b.length){
            output[m] = b[k];
            k++;
            m++;
        }
        return output;
    }

    public static void main(String args[]){

        System.out.println(10/2);
        System.out.println(19/2);
        int[] a = {5,6};
        int[] b = {3,4};
        int[] c = {5,6,3,4};
        int[] output = new int[a.length+b.length];

        output = sort(a,b,output);
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]);
        }
        System.out.println();
        int[] ef = {5,4,3,1};
        ef = mergesort(ef);
        for(int i=0;i<ef.length;i++){
            System.out.print(ef[i]);
        }
    }
}
