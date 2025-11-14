public class lc_2536 {
     public static int[][] rangeAddQueries(int n, int[][] queries) {
          int mat[][] = new int[n][n];

          for (int i = 0; i < queries.length; i++) {
               for (int j = queries[i][0]; j <= queries[i][2]; j++) {
                    for (int k = queries[i][1]; k <= queries[i][3]; k++) {
                         mat[j][k]++;
                    }
               }
          }

          return mat;
     }

     public static void main(String[] args) {
          int n=3;
          int queries[][]={{1,1,2,2},{0,0,1,1}};

          for(int x[]:rangeAddQueries(n, queries)){
               for(int y:x){
                    System.out.print(y+" ");
               }
               System.out.println();
          }
     }
}
