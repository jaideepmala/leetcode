package trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    char c;
    Map<Character,TrieNode> child = new HashMap<>();
    boolean isLeaf;
    public TrieNode(){
    }
    public TrieNode(char c){
        this.c = c;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public Map<Character, TrieNode> getChild() {
        return child;
    }

    public void setChild(Map<Character, TrieNode> child) {
        this.child = child;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        this.isLeaf = leaf;
    }
}
