import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerToEnglish {

        public static String numberToWords(int num) {
            String res = "";
            Map<Integer,String> singles = new HashMap<>();
            singles.put(0,"Zero");
            singles.put(1,"One");
            singles.put(2,"Two");
            singles.put(3,"Three");
            singles.put(4,"Four");
            singles.put(5,"Five");
            singles.put(6,"Six");
            singles.put(7,"Seven");
            singles.put(8,"Eight");
            singles.put(9,"Nine");
            singles.put(10,"Ten");
            singles.put(11,"Eleven");
            singles.put(12,"Twellve");
            singles.put(13,"Thirteen");
            singles.put(14,"Fourteen");
            singles.put(15,"Fifteen");
            singles.put(16,"Sixteen");
            singles.put(17,"Seventeen");
            singles.put(18,"Eighteen");
            singles.put(19,"Nineteen");

            singles.put(20,"Twenty");
            singles.put(30,"Thirty");
            singles.put(40,"Fourty");
            singles.put(50,"Fifty");
            singles.put(60,"Sixty");
            singles.put(70,"Seventy");
            singles.put(80,"Eighty");
            singles.put(90,"Ninety");

            singles.put(100,"Hundred");
            singles.put(1000,"Thousand");
            singles.put(1000000,"Million");
            singles.put(1000000000,"Billion");


            List<Integer> inputlist = new ArrayList<>();
            if(num > 0 && num < 10){
                inputlist.add(num);
            }
            else if(num >= 10 && num < 100){
                inputlist.add(num%10);
                inputlist.add(num -(num%10));
            }
            else if(num >= 100 && num < 1000){
                inputlist.add(num%10);
                inputlist.add((num -(num%10))%100);
                inputlist.add(num - ((num -(num%10))%100) - (num%10));
            }
            else if(num >= 1000 && num < 10000){
                inputlist.add(num%10);
                inputlist.add(num%100 - num%10);
                inputlist.add(num%1000 - num%100);
                inputlist.add(num - (num%1000));
            }
            else if(num >= 10000 && num < 1000000){
                inputlist.add(num%10);
                inputlist.add(num%100 - num%10);
                inputlist.add(num%1000 - num%100);
                if(num >= 100000 && num < 1000000){
                    inputlist.add(num%1000000 - num%1000 );
                }else{
                    inputlist.add(num%100000 - num%1000 );
                }

            }

            String s ="";
            for(int i=inputlist.size()-1;i>=0;i--){
                Integer k = inputlist.get(i);
                System.out.println(k);
                if(k != 0) {
                    if(k >= 100000 && k <= 999999 ){
                        res = res + singles.get(((k/1000) - ((k/1000) % 10))/100) + " ";
                        res = res + singles.get(((k/1000) - ((k/1000) % 10))%100) + " ";
                        res = res + singles.get((k/1000) % 10) + " ";
                        res = res + singles.get(1000)+" ";
                    }
                    else if(k >= 10000 && k <= 99999 ){
                        res = res + singles.get((k/1000) - ((k/1000) % 10)) + " ";
                        res = res + singles.get((k/1000) % 10) + " ";
                        res = res + singles.get(1000)+" ";
                    }
                    else if(k >= 1000 && k <= 9999 ){
                        res = res + singles.get(k/1000) + " ";
                        res = res + singles.get(1000)+" ";
                    }
                    else if(k >= 100 && k<= 999 ) {
                        res = res + singles.get(k / 100) + " ";
                        res = res + singles.get(100) + " ";
                    }
                    else if(k >= 10 && k<= 99 ){
                        res = res + singles.get(k) + " ";
                    }else{
                        res = res + singles.get(k);
                        if(i != 0){
                            res = res+" ";
                        }

                    }
                }
            }

            return res;

        }


    public static void main(String[] args) {
        System.out.println("--------"+numberToWords(995223));
    }


}
