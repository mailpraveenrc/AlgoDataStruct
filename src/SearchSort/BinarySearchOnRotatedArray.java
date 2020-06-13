package SearchSort;

public class BinarySearchOnRotatedArray {

    public static int search(int[] input,int check){
        int res =0;
        if(input.length ==0) return -1;

        int left =0;
        int right = input.length-1;
        int i =0;
        while (left <= right){
            int median = (left + right)/2;
            if(check == input[median]){
                return  median;
            }
            if(check > input[median]){
                left = median+1;
            }else{
                right =median-1;
            }
        }
        System.out.println(left);
        System.out.println(right);

        return -1;
    }

    public static void main(String args[]){
        int[] input = {3,4,9,11,50,77,-1,0,1,2};
        System.out.println(search(input,77));
    }
}
