public class NumberfromString {
        public static int myAtoi(String str) {
            String s = "";
            int op =1;
            for(int k=0;k<str.length();k++){
                int y = str.charAt(k);
                if((str.charAt(k) == 45) || (str.charAt(k) == 32 )|| (str.charAt(k) >= 48 && str.charAt(k) <=57)){

                }else{
                    return 0;
                }

                if(str.charAt(k) == '-'){
                    op = -1*op;
                }
                if(str.charAt(k) >= 48 && str.charAt(k) <=57){
                    s = s+str.charAt(k);
                }
            }
            int p = Integer.parseInt(s)*op;
            return p;
        }


    public static void main(String[] args) {
        System.out.println(myAtoi("-42"));
    }


}
