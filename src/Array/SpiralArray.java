package Array;

    import java.util.*;

public class SpiralArray {
        public static List<Integer> spiralTraverse(int[][] array) {
            List<Integer> res = new ArrayList<>();
            res = traverse(array,0,array.length-1,0,array[0].length-1,res);
            for(Integer i : res){
                System.out.println("------------------"+i);
            }
            return res;
        }
        /*
    [[1, 2, 3],
    [12, 13, 4],
    [11, 14, 5],
    [10, 15, 6],
    [9, 8, 7]
        */
        private static List<Integer> traverse
        (int[][] array,int begin,int end,int beginC,int endC,
         List<Integer> res){
            System.out.println("- "+begin);
            System.out.println("- "+end);

            if(begin > end || beginC > endC) return res;
            int current = beginC;
            while(current <= endC){
                res.add(array[beginC][current]);
                current++;
            }
            current = begin;
            current++;
            while(current <= end){
                res.add(array[current][endC]);
                current++;
            }
            current = endC-1;
            while(current >= beginC){
                if(begin == end) break;
                res.add(array[end][current]);
                current--;
            }
            current = end-1;
            while(current >= begin+1){
                if(beginC == endC) break;
                res.add(array[current][begin]);
                current--;

            }
            begin = begin+1;
            end = end - 1;
            beginC = beginC+1;
            endC = endC-1;
            traverse(array,begin,end,beginC,endC,res);
            return res;
        }
    }


