public class Zigzagstring {
        public String convert(String s, int numRows) {
            String[][] input = new String[numRows][s.length()];
            StringBuilder builder = new StringBuilder();
            if(s.length() == 0) return "";
            constructZigZag(input,s,0,0,0);
            for(int i =0; i <input.length; i++){
                for(int j =0; j <input[i].length; j++){
                    if(input[i][j] != null){
                        builder.append(input[i][j]);
                    }
                }
            }
            return builder.toString();
        }

        private void constructZigZag(String[][] input,String s,int i,int j,int index){
            if(index == s.length()) return;
            while(i < input.length && j <= s.length()){
                if(index == s.length()) return;
                input[i][j] = String.valueOf(s.charAt(index));
                index ++;
                i++;
            }
            i = input.length-2;
            while(i > 0 &&  j < (s.length())){
                if(index == s.length()) return;
                j++;
                input[i][j] = String.valueOf(s.charAt(index));
                index ++;
                i--;
            }
            j++;
            if(index == s.length()) return;
            constructZigZag(input,s,i,j,index);
        }


    public  static  void  main(String args[]){
            Zigzagstring o = new Zigzagstring();
            System.out.println("-----"+o.convert("PAYPALISHIRING",3));
    }

    }