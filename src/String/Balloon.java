package String;

public class Balloon {

    public static int find(String text) {
            int[] alpha_set = new int[26];

            for(int i=0;i<text.length();i++){
                alpha_set[text.charAt(i) -'a']++;
            }
            int count = alpha_set[1];// b
            count = Math.min(count,alpha_set[0]); //a
            count = Math.min(count,alpha_set[11]/2); //l
            count = Math.min(count,alpha_set[13]/2); //o
            count = Math.min(count,alpha_set[14]); //n
            return count;
    }

    public static void main(String args[]){
        System.out.println(find("balloonballoonbaon"));
    }
}
