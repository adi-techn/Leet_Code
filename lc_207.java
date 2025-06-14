import java.util.ArrayList;

public class lc_207 {
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
            graph[pre[i][1]].add(new Edge(pre[i][1],pre[i][0]));
        }
    }
    public static boolean dfs(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(dfsUtil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfsUtil(ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!vis[e.dest] && dfsUtil(graph,e.dest,vis,stack)){
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Edge> graph[]=new ArrayList[numCourses];
        create(graph,prerequisites);
        return !dfs(graph);  //if Acyclical then return true else false
    }
     public static void main(String[] args) {
          int pre[][]={{1,0}};
          System.out.println(canFinish(2, pre));

     }
}
