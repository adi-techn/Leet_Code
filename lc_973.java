import java.util.PriorityQueue;

public class lc_973 {
     public static int[][] kClosest(int[][] points, int k) {
        int res[][]=new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            Integer.compare(b[0]*b[0] + b[1]*b[1], a[0]*a[0] + a[1]*a[1])
        );
        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);
            if (pq.size() > k) {
                pq.remove(); // remove the farthest point
            }
        }
        for(int i=0;i<k;i++){
            res[i]=pq.remove();
        }
        return res;
     }
     public static void main(String[] args) {
          int points[][]={{1,3},{-2,2}};
          int k=1;
          int res[][]=kClosest(points, k);
          for(int i=0;i<res.length;i++){
               for(int j=0;j<res[0].length;j++){
                    System.out.print(res[i][j]+" ");
               }
               
          }
     }
}
