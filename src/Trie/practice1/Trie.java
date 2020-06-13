package Trie.practice1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Trie {
    class TrieNode{
        char c;
        HashMap<Character,TrieNode> children = new HashMap<>();
        boolean isEndOfWord;
        int wordcount;
        TrieNode(){

        }
        TrieNode(char inp){
            this.c = inp;
        }
    }

        TrieNode root;

        Trie(){
            root = new TrieNode();
        }

        public void insert(String word){
            HashMap<Character,TrieNode> child = root.children;
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                TrieNode curr ;
                if(child.containsKey(c)){
                    curr = child.get(c);
                }else{
                    curr = new TrieNode(c);
                    child.put(c,curr);
                }
                if(i == word.length()-1){
                    curr.isEndOfWord= true;
                }
                child = curr.children;
            }
        }

        public boolean search(String word){
            boolean response = false;
            HashMap<Character,TrieNode> child = root.children;
            TrieNode curr = null;
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                if(child.containsKey(c)){
                    curr = child.get(c);
                    child = curr.children;
                }else{
                    break;
                }
            }
            if(curr != null){
                return  true;
            }
            return response;
        }


        public TrieNode searchNode(String word){
            HashMap<Character,TrieNode> child = root.children;
            TrieNode curr = null;
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                if(child.containsKey(c)){
                    curr = child.get(c);
                    child = curr.children;
                }else{
                    return null;
                }
            }
            return curr;
        }
    public String lcp() {

        StringBuilder result = new StringBuilder();
        TrieNode curr = this.root;
        while(curr!=null && !curr.isEndOfWord && curr.children.size()==1) {
            Map<Character, TrieNode> treemapItertor = curr.children;
            for(Map.Entry<Character, TrieNode> e : treemapItertor.entrySet()){
                result.append(e.getKey());
                curr= e.getValue();
            }
        }
        return result.toString();
    }



    public static void main(String args[]){
        Trie t = new Trie();
        t.insert("xcard");
        t.insert("cartow");

//        TrieNode r = t.searchNode("dog");
        String s  = t.lcp();
        System.out.println("------"+s);

    }
}
