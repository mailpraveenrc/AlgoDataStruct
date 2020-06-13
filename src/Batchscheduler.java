import java.util.*;

public class Batchscheduler {
    public int leastInterval(char[] tasks, int n) {
            Map<Character,Integer>  map = new HashMap<>();
            for (char c: tasks) {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            PriorityQueue< Integer > queue = new PriorityQueue < > (26, Collections.reverseOrder());
            queue.addAll(map.values());
            int time = 0;
            while (!queue.isEmpty()) {
                List< Integer > holder = new ArrayList< >();
                for(int i =0;i <= n;i++) {
                    if(!queue.isEmpty()){
                        holder.add(queue.remove());
                    }
                }
                for(int h : holder){
                    h = h-1;
                    if(h > 0) queue.add(h);
                }
                if(!queue.isEmpty()){
                    time += n+1;
                }else{
                    time += holder.size();
                }
            }
            return time;
        }

    public static void main(String[] args) {
       // char[] inp = new char[] {'A','A','B','C','B','C','C'};
        char[] inp = new char[] {'C','B','P','P','O'};
// 2 1 1 1 /2 (1,1): 1 1 1 (1)/4 1 = 5
        // 3 2 2 1 / 3 : 2 1 1 1/ 6: 1 1 / 8
        // total distinct 4 n+1 = 3
        // total distinct - num+1 = remaining untouched
        // decrement count on list
        Batchscheduler obj = new Batchscheduler();
        int out = obj.leastInterval(inp,1);
        System.out.println("------------------------"+out);

    }

    }
