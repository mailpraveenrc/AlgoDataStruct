package SearchSort;

import java.util.*;

public class ArmyCount {

        public static int[] kWeakestRows(int[][] mat, int k) {
            Map<Integer,List<Integer>> m = new HashMap<>();
            Set<Integer> resultSet = new HashSet<>();
            int[] res = new int[k];
            for(int i=0;i<mat.length;i++){
                int left =0;
                int right =mat[i].length-1;
                while(left <= right){
                    int pivot = left +(right -left)/2;
                    if(mat[i][pivot] == 0){
                        right = pivot-1;
                    }else{
                        left = pivot+1;
                    }
                }
                resultSet.add(left);
                if(m.get(left) != null){
                    List<Integer> a = m.get(left);
                    a.add(i);
                }else{
                    List<Integer> a = new ArrayList<>();
                    a.add(i);
                    m.put(left,a);
                }
            }
            int[] result = new int[resultSet.size()];
            int ind=0;
            for(int y: resultSet){
                result[ind] =y;
                ind++;
            }
            Arrays.sort(result);
            int ulticount=0;
            for(int o=0;o<result.length;o++){
                for(Map.Entry<Integer, List<Integer>> e : m.entrySet()){
                    if(e.getKey() == result[o]){
                        for(int v : e.getValue()){
                            System.out.println("-------"+v);
                            res[ulticount] = v;
                            ulticount++;
                            if(ulticount == k) break;
                        }
                    }
                    if(ulticount == k) break;
                }
                if(ulticount == k) break;
            }
            return res;
        }

    public static void main(String args[]){
         int[][] inp = {{1,0},{1,0},{1,0},{1,1}};
         int[] o = kWeakestRows(inp,4);
         for(int i: o){
             System.out.println(i);
         }
    }
}
