package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinMaxHeap {

    public static void main(String[] args) {

        int[] input = new int[]{44,22,1,99};
        PriorityQueue<Integer> int_pq = new PriorityQueue<>();
        for(int i : input){
            int_pq.offer(i);
        }

        System.out.println(" -----------------");
        int S = int_pq.size();

        for(int pq =0; pq < S;pq++){
            System.out.println(int_pq.poll());
        }

        Character[] c_input = new Character[]{'z','a','y','b'};
        PriorityQueue<Character> char_pq = new PriorityQueue<>();
        for(Character c : c_input){
            char_pq.offer(c);
        }
        System.out.println(" -----------------");
        int S_C = char_pq.size();

        for(int pq =0; pq < S_C;pq++){
            System.out.println(char_pq.poll());
        }

        int[][] intervals = new int[][]{{4,7},{8,9},{1,2}};

        PriorityQueue<Integer> allocator =
                new PriorityQueue<Integer>(
                        intervals.length,
                        new Comparator<Integer>() {
                            public int compare(Integer a, Integer b) {
                                return a - b;
                            }
                        });

        int allo_size = allocator.size();

        for(int a =0; a < allo_size;a++){
            System.out.println(allocator.poll());
        }
    }

}
