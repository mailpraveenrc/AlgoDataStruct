import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringRestaurent {
        public String[] findRestaurant(String[] list1, String[] list2) {
            // put in map with index
            // while iterating second list check if it exist get the index and curr index
            // sum both index /2 put it string,2
            // if res is empty add
            // if index == previndex add again else dont add
            // iterate map and return array
            Map<String,Integer> result = new HashMap<>();

            Map<String,Integer> map1 = new HashMap<>();
            for(int i=0; i < list1.length; i++){
                map1.put(list1[i],i);
            }
            for(int i=0; i < list2.length; i++){
                if(map1.containsKey(list2[i])){
                    int rank = i + 1 + 1 + map1.get(list2[i]);
                    if(result.size() == 0) {
                        result.put(list2[i],rank);
                    }
                    else if(result != null && result.size() > 0){
                        result.put(list2[i],rank);
                    }
                }
            }

            List<String> resList = new ArrayList<>();
            int currvalue = Integer.MAX_VALUE;
            for(Map.Entry<String,Integer> e : result.entrySet()){
                if(e.getValue() <= currvalue){
                    currvalue = e.getValue();
                }
            }

            for(Map.Entry<String,Integer> e : result.entrySet()){
                if(e.getValue() == currvalue){
                    resList.add(e.getKey());
                }
            }
            String[] a_result = new String[resList.size()];
            int index =0;
            for(String s : resList){
                a_result[index] = s;
                index++;
            }
            return a_result;
        }
        public static void main(String[] args) {
            StringRestaurent o = new StringRestaurent();
            String[] list1 = new String []{"Shogun","Tapioca Express","Burger King","KFC"};
            String[] list2 = new String []{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
            String[] res = o.findRestaurant(list1,list2);
            for(String s : res){
                System.out.println("----"+s);
            }
        }
    }