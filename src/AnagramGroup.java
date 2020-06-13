
import java.util.*;

public class AnagramGroup {
    public static List<List<String>> groupAnagrams(List<String> words) {

        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> sortedWords = new HashMap<>();
        for(String s : words){
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            String sorted = String.valueOf(tmp);
            if(sortedWords.containsKey(sorted)){
                List<String> anagGroup = sortedWords.get(sorted);
                anagGroup.add(s);
            }else{
                List<String> anagGroup = new ArrayList<>();
                anagGroup.add(s);
                sortedWords.put(sorted,anagGroup);
            }
        }
        for(Map.Entry<String,List<String>> e : sortedWords.entrySet()){
            result.add(e.getValue());
        }
        return result;

    }
}


