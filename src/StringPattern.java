import java.util.HashMap;
import java.util.Map;

public class StringPattern {
    public boolean isIsomorphic(String s, String t) {
        // if both are diff length false
        // map of char,char check if exist not false else do till end
        // if everything passed true
        // s = "paper", t = "title"
        if(s == null || s.length() == 0 || t == null || t.length() == 0 || (s.length() != t.length())) return false;
        Map<Character,Character> s_Mapping = new HashMap<>();
        Map<Character,Character> t_Mapping = new HashMap<>();

        int L = s.length();
        for(int i=0 ; i < L;i++){
            if(s_Mapping.containsKey(s.charAt(i))){
                char t_c = t.charAt(i);
                if(! (s_Mapping.get(s.charAt(i)) == t_c)) return false;
            }else{
                s_Mapping.put(s.charAt(i),t.charAt(i));
            }
            if(t_Mapping.containsKey(t.charAt(i))){
                char s_c = s.charAt(i);
                if(! (t_Mapping.get(t.charAt(i)) == s_c)) return false;
            }else{
                t_Mapping.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }


    public  static  void  main(String args[]){
        StringPattern o = new StringPattern();
        System.out.println("-----"+o.isIsomorphic("ab","aa"));
    }
}
