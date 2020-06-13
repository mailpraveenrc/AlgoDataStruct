package Array;

import java.util.*;

public class ParenthesisAllpossible {
        List<String> validSet = new ArrayList<>();

        public List<String> generateParenthesis(int n) {
            List<String>  res = new ArrayList<>();
            String inp = "()";
            for(int i=1;i<n;i++){
                inp =inp+"()";
            }
            permutation(inp,"");
            int count = validSet.size();
            for(int p=0;p<validSet.size();p++){
                if (validParenthesis(validSet.get(p)))
                    res.add(validSet.get(p));
            }
            Set<String> tmp = new HashSet<>(res);
            return new ArrayList<>(tmp);
        }

        public void permutation(String str, String ans)
        {
            if (str.length() == 0) {
                if(ans.length() ==6){
                    validSet.add(ans);
                }
                return;
            }
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) +
                        str.substring(i + 1);
                permutation(ros, ans + ch);
            }
        }

        public boolean validParenthesis(String s){
            if (s == null) return false;
            Stack<Character> st = new Stack<Character>();
            for(int i=0;i<s.length();i++) {
                if (s.charAt(i) == '(') {
                    st.push(s.charAt(i));
                    continue;
                }
                if(st != null && st.size() > 0 && s.charAt(i) == ')'){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
            return st.isEmpty();
        }


    public static void main(String args[]){
            ParenthesisAllpossible o = new ParenthesisAllpossible();
        System.out.println(o.generateParenthesis(3).size());
    }
    }