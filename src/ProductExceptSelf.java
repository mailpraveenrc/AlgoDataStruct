public class ProductExceptSelf {

    static int[] calculateApproach1(int[] input) {
        int[] res = new int[input.length];
        int cal = 1;
        for (int k = 0; k < input.length; k++) {
            cal = cal * input[k];
        }
        for (int k = 0; k < input.length; k++) {
            res[k] = cal / input[k];
        }
        return  res;
    }

    static int[] calculateApproach2(int[] input) {
        int[] res = new int[input.length];
        int[] left = new int[input.length];
        int[] right = new int[input.length];
        left[0] = 1;
        right[input.length-1] = 1;
        for (int k = 1; k < input.length; k++) {
            left[k] = input[k-1] * left[k-1];
        }

        for (int m = input.length -  2; m >=0; m--) {
            right[m] = input[m+1] * right[m+1];
        }

        for (int k = 0; k < input.length; k++) {
            res[k] = left[k] * right[k];
        }
        return  res;
    }


    static int[] calculateApproach3(int[] input) {
        int[] left = new int[input.length];
        left[0] = 1;
        for (int k = 1; k < input.length; k++) {
            left[k] = input[k-1] * left[k-1];
        }

        int c= 1;
        for (int m = input.length -  2; m >=0; m--) {
            c = c * input[m+1];
            left[m] = left[m] * c;
        }

        return left;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] res = calculateApproach1(array);
        for(int m=0;m<res.length;m++){
            System.out.println("--------"+res[m]);
        }

        int[] res2 = calculateApproach2(array);

        for(int m=0;m<res2.length;m++){
            System.out.println("********"+res2[m]);
        }


        int[] res3 = calculateApproach3(array);

        for(int m=0;m<res3.length;m++){
            System.out.println(">>>>>>>>>>>> "+res3[m]);
        }

    }
}
