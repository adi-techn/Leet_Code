public class WordDictionary {
    class Node{
        Node child[]=new Node[26];
        boolean eow=false;

        public Node(){
            for(int i=0;i<26;i++){
                child[i]=null;
            }
        }
    }
    public Node root;
    public WordDictionary() {
       root=new Node();
    }
    
    public void addWord(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx]=new Node();
            }
            curr=curr.child[idx];
        }
        curr.eow=true;
    }
    
    public boolean search(String word) {
        return helper(word,0,root);
    }
    private boolean helper(String word,int idx,Node node){
        if(idx==word.length()){
            return node.eow;
        }
        char ch=word.charAt(idx);
        if(ch=='.'){
            for(int i=0;i<26;i++){
                if(node.child[i]!=null && helper(word,idx+1,node.child[i])){
                    return true;
                }
            }
            return false;
        }else{
            int id=ch-'a';
            if(node.child[id]==null){
                return false;
            }
            return helper(word,idx+1,node.child[id]);
        }
    }
}