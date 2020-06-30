import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HappyNumbers {


        public boolean isHappy(int n) {
            Map<Integer,Integer> powerNum = new HashMap();
            Set<Integer> cycle = new HashSet<>();
            for(int i=0; i <= 10; i++){
                powerNum.put(i,i*i);
            }
            String n_s = String.valueOf(n);
            //int res = Integer.parseInt(findHappy(n_s,powerNum,cycle));
            int res = findHappy2(n,powerNum,cycle);
            if(res == 1) return true;
            return false;
        }

        private String findHappy(String input,Map<Integer,Integer> powerNum,Set<Integer> cycle){
            String temp_s = new String();
            int temp = 0;
            for(char c : input.toCharArray()){
                String key = String.valueOf(c);
                temp += powerNum.get(Integer.valueOf(key));
            }
            temp_s = Integer.toString(temp);
            if(cycle.contains(temp)) return temp_s;
            cycle.add(temp);
            if(temp == 1) {
                return temp_s;
            }else{
                return findHappy(temp_s,powerNum,cycle);
            }
        }


    private int findHappy2(int input,Map<Integer,Integer> powerNum,Set<Integer> cycle){
        int temp = 0;
        while(input >= 10){
            int mod = input%10;
            if(mod > 0){
                input = input - mod;
            }else{
                input = input / 10;
            }
            temp += powerNum.get(mod);
        }
        temp += powerNum.get(input);
        if(cycle.contains(temp)) return temp;
        cycle.add(temp);
        if(temp == 1) {
            return temp;
        }else{
            return findHappy2(temp,powerNum,cycle);
        }
    }


    public static void main(String[] args) {
        HappyNumbers obj = new HappyNumbers();
        System.out.println("---------"+obj.isHappy(7));
    }
    }