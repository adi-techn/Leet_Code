import java.util.ArrayList;
import java.util.Stack;

public class lc_210 {
     static class Edge{
          int src;
          int dest;

          public Edge(int src,int dest){
               this.src=src;
               this.dest=dest;
          }
     }
     public static void create(ArrayList<Edge> graph[],int pre[][]){
          for(int i=0;i<graph.length;i++){
               graph[i]=new ArrayList<>();
          }
          for(int i=0;i<pre.length;i++){
               graph[pre[i][1]].add(new Edge(pre[i][1], pre[i][0]));
          }
     }
     public static int[] dfs(ArrayList<Edge> graph[]){
          boolean vis[]=new boolean[graph.length];
          boolean stack[]=new boolean[graph.length];
          Stack<Integer> s=new Stack<>();

          for(int i=0;i<graph.length;i++){
               if(!vis[i]){
                    if(dfsUtil(graph,i,vis,stack,s)){
                         return new int[0];
                    }
               }
          }
          int arr[]=new int[graph.length];
          int i=0;
          while(!s.isEmpty()){
               arr[i++]=s.pop();
          }
          return arr;
     }
     public static boolean dfsUtil(ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack[],Stack<Integer> s){
          vis[curr]=true;
          stack[curr]=true;

          for(int i=0;i<graph[curr].size();i++){
               Edge e=graph[curr].get(i);
               if(stack[e.dest]){
                    return true;
               }
               if(!vis[e.dest] && dfsUtil(graph, e.dest, vis, stack, s)){
                    return true;
               }
          }
          stack[curr]=false;
          s.push(curr);
          return false;
     }
     public static void main(String[] args) {
          int pre[][]={{1,0},{2,0},{3,1},{3,2}};
          int v=4;
          @SuppressWarnings("unchecked")
          ArrayList<Edge> graph[]=new ArrayList[v];
          create(graph, pre);
          for(int x:dfs(graph)){
               System.out.print(x+" ");
          }
     }
}