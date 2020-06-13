package SearchSort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortComparator {
    public static void main(String[] args) {

        String[] s_array = new String[]{"xyz","abc"};
        System.out.println("String Before Sorted Array");
        for (String a : s_array){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println(" ");

        Arrays.sort(s_array);
        System.out.println("String After Sorted Array");
        for (String a : s_array){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println(" ");

        char[] c_array = new char[]{'d','c'};
        System.out.println("Char Before Sorted Array");
        for (char a : c_array){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println(" ");

        Arrays.sort(c_array);
        System.out.println("Char After Sorted Array");
        for (char a : c_array){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println(" ");
        int[] array = new int[]{77,9,1,999,7,65};
        System.out.println("Before Sorted Array");
        for (int a : array){
            System.out.print(a);
            System.out.print(" ");
        }
        Arrays.sort(array);
        System.out.println("After Sorted Array");
        for (int a : array){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println(" ");
        Integer[] rev_array = new Integer[array.length];
        for(int i =0;  i < array.length;i++){
            rev_array[i] = array[i];
        }
        Arrays.sort(rev_array, Collections.reverseOrder());
        System.out.println("After Reverse Sorted Array");

        for (int a : rev_array){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println(" ");

        int[][] d_array = new int[][]{{100,200},{1,2},{22,33}};
        System.out.println("Before Sorted 2 dim Array");
        for (int[] a_a : d_array){
            for(int a : a_a){
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.print(" ");
        }
        System.out.println(" ");

        Arrays.sort(d_array,(a,b) -> Integer.compare(a[0],b[0]));
        System.out.println("After Sorted Array");
        for (int[] a_a : d_array){
            for(int a : a_a){
                System.out.print(a);
            }
            System.out.print(" ");
        }

        int[][] d_r_array = new int[][]{{100,200},{1,2},{22,33}};
        System.out.println("Before Sorted 2 dim Array rev");
        for (int[] a_r : d_r_array){
            for(int a : a_r){
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.print(" ");
        }
        System.out.println(" ");
        Arrays.sort(d_array,(a,b) -> Integer.compare(b[0],a[0]));
        System.out.println("After Reverse Sorted Array");
        for (int[] a_r : d_r_array){
            for(int a : a_r){
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.print(" ");
        }

    }
}
