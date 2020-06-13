package Array;

public class RotateArray {

    public int[] rotatearray(int[] input,int k){
        k = k%input.length;
        System.out.println(k);
        reverse(input,0,input.length-1);
        reverse(input,0,k-1);
        reverse(input,k,input.length-1);
        return input;
    }

    public void reverse(int input[],int start,int end){
        while(start < end){
            int temp = input[start];
            input[start] = input[end];
            input[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]){

        int[] input = {1,2,3,4,5};
        for(int i =0;i<input.length;i++){
            System.out.print(input[i]);
        }
        System.out.println();
         RotateArray o = new RotateArray();
         o.rotatearray(input,7);
         for(int i =0;i<input.length;i++){
             System.out.print(input[i]);
         }

    }
}
