public class ArrayShift {


    public static void main(String[] args) {
        int[] a= {1, 2, 3, 4, 5};
        int temp = a[a.length-1];
        for (int p = a.length-2; p >=0; p--) {
            a[p+1] = a[p];
        }
        a[0] =temp;
        for (int p = 0; p < a.length; p++) {
            System.out.print(a[p]+" ");
        }

    }
}
