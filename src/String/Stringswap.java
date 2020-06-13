package String;

public class Stringswap {

        public String reverseOnlyLetters(String S) {

            char[] characters = S.toCharArray();
            int start = 0;
            int end = S.length() -1;
            while(start < end){
                while(start < end &&
                        !((characters[start] >= 'a' && characters[start] <= 'z' )
                                || (characters[start] >= 'A' && characters[start] <= 'Z' ))){
                    start ++;
                }
                while(start < end &&
                        !((characters[end] >= 'a' && characters[end] <= 'z' )
                                || (characters[end] >= 'A' && characters[end] <= 'Z' ))){
                    end --;
                }
                char tmp = characters[end];
                characters[end] = characters[start];
                characters[start] = tmp;

                end --;
                start++;
            }

            return String.valueOf(characters);
        }

    public static void main(String[] args) {
     Stringswap O = new Stringswap();
     System.out.println(">>>>>>>>> "+O.reverseOnlyLetters("ab-cd"));

    }
    }
