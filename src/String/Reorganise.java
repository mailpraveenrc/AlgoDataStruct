package String;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Reorganise {
    public String reOrg(String input){
        Map<Character,Integer> count = new HashMap<>();
        for(char c : input.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> queue = new PriorityQueue<>((a,b) -> count.get(b) - count.get(a));
        queue.addAll(count.keySet());
        StringBuilder sb = new StringBuilder();
        while(queue.size() > 1) {
            char max = queue.remove();
            char next = queue.remove();

            sb.append(max);
            sb.append(next);

            count.put(max, count.get(max) - 1);
            count.put(next, count.get(next) - 1);

            if (count.get(max) > 0) {
                queue.add(max);
            }
            if (count.get(next) > 0) {
                queue.add(next);
            }
        }

        if(!queue.isEmpty()){
            char c = queue.remove();
            if(count.get(c) > 1) {
                 return "";
            }
            sb.append(c);
        }
        return  sb.toString();
    }
    public static void main(String args[]){
        Reorganise o = new Reorganise();
        System.out.println(o.reOrg("abaa"));
    }
}
