package trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    public void insert(String word){
        Map<Character,TrieNode> child = root.getChild();
        TrieNode tmp;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(child.containsKey(c)){
                tmp= child.get(c);
            }else{
                tmp = new TrieNode(c);
                child.put(c,tmp);
            }
            child = tmp.getChild();
            if(i==word.length()-1)
                tmp.isLeaf=true;
        }
    }

    public boolean search(String word){
        Map<Character,TrieNode> child = root.getChild();
        TrieNode tmp=null;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(child.containsKey(c)){
                tmp=child.get(c);
                child = tmp.getChild();
            }else {
                tmp = null;
                break;
            }
        }
        if(tmp!=null && tmp.isLeaf())
            return true;
        else
            return false;
    }
}
