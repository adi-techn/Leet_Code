import java.util.*;
public class lc_386 {
    static class Node{
        Node child[]=new Node[10];
        boolean eow=false;

        public Node(){
            for(int i=0;i<10;i++){
                child[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(int n){
        Node curr=root;
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'0';
            if(curr.child[idx]==null){
                curr.child[idx]=new Node();
            }
            curr=curr.child[idx];
        }
        curr.eow=true;
    }
    public static void traverse(Node node,String path,List<Integer> arr){
        if(node==null){
            return;
        }
        if(node.eow){
            arr.add(Integer.parseInt(path));
        }
        for(int i=0;i<10;i++){
            if(node.child[i]!=null){
                traverse(node.child[i],path+i,arr);
            }
        }
    }
    public static List<Integer> lexicalOrder(int n) {
        for(int i=1;i<=n;i++){
            insert(i);
        }
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<=9;i++){
            if(root.child[i]!=null){
                traverse(root.child[i],String.valueOf(i),arr);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
      int n=13;
      System.out.println(lexicalOrder(n));
    }
}