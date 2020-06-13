package Array;

import java.util.Arrays;

public class SortArray {

    public static void main(String args[]){
        int[] i = {1,2,5,4,9,8};
        for(int k=0;k<i.length;k++){
            System.out.println(i[k]);
        }
        Arrays.sort(i);
        for(int k=0;k<i.length;k++){
            System.out.println(i[k]);
        }

        int[][] inp = {{9,8},{1,2},{5,4}};
        for(int k=0;k<inp.length;k++){
            System.out.println(inp[k][0]);
            System.out.println(inp[k][1]);
        }
        Arrays.sort(inp,(a1,a2) -> Integer.compare(a1[1],a2[1]));
        for(int k=0;k<inp.length;k++){
            System.out.println(inp[k][0]);
            System.out.println(inp[k][1]);
        }
    }
}
