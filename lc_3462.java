import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class lc_3462 {
     public static long maxSum(int[][] grid, int[] limits, int k) {
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        int l=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<grid.length;i++){
            int lim=limits[i];
            int s=grid[i].length-1;
            while(lim!=0){
                pq.add(grid[i][s]);
                s--;
                lim--;
            }
        }
        long max_sum=0;
        for(int i=0;i<k;i++){
            max_sum+=pq.remove();
        }
        return max_sum;
     }
     public static void main(String[] args) {
          int grid[][]={{1,2},{3,4}};
          int lim[]={1,2};
          int k=2;

          System.out.println(maxSum(grid, lim, k));
     }
}
