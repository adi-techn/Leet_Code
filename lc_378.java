import java.util.PriorityQueue;

public class lc_378{
     public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pq.add(matrix[i][j]);
            }
        }
        int num=-1;
        while(k!=0){
            num=pq.remove();
            k--;
        }
        return num;
     }
     public static void main(String[] args) {
          int mat[][]={{1,5,9},{10,11,13},{12,13,15}};
          int k=8;
          System.out.println(kthSmallest(mat, k));
     }
}