import java.util.Comparator;
import java.util.PriorityQueue;

public class lc_3275 {
     public static int[] resultsArray(int[][] queries, int k) {
        /*
        ArrayList<Integer> arr=new ArrayList<>();
        int res[]=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int dist=Math.abs(queries[i][0])+Math.abs(queries[i][1]);
            arr.add(dist);
            if(arr.size()>=k){
                Collections.sort(arr);
                res[i]=arr.get(k-1);
            }else{
                res[i]=-1;
            }
        }
        return res;
        */

        int res[]=new int[queries.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<queries.length;i++){
            int dist=Math.abs(queries[i][0])+Math.abs(queries[i][1]);
            pq.add(dist);
            if(pq.size()>k){
                pq.remove();
            }
            if(pq.size()==k){
                res[i]=pq.peek();
            }else{
                res[i]=-1;
            }
        }
        return res;
     }
     public static void main(String[] args) {
          int que[][]={{1,2},{3,4},{2,3},{-3,0}};
          int k=2;
          for(int x:resultsArray(que, k)){
               System.out.print(x+" ");
          }
     }
}
