public class lc_2482{
     public static int[][] onesMinusZeros(int[][] grid) {
          int m=grid.length,n=grid[0].length;
          int diff[][]=new int[m][n];

          int row1[]=new int[m],row0[]=new int[m];
          int col1[]=new int[n],col0[]=new int[n];

          for(int i=0;i<m;i++){
               int row_1=0,row_0=0;
               for(int j=0;j<n;j++){
                    if(grid[i][j]==0){
                         row_0++;
                    }
                    else{
                         row_1++;
                    }
               }
               row1[i]=row_1;
               row0[i]=row_0;
          }
          for(int i=0;i<n;i++){
               int col_1=0,col_0=0;
               for(int j=0;j<m;j++){
                    if(grid[j][i]==0){
                         col_0++;
                    }
                    else{
                         col_1++;
                    }
               }
               col1[i]=col_1;
               col0[i]=col_0;
          }
          for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                    diff[i][j]=(row1[i]+col1[j]-row0[i]-col0[j]);
               }
          }
          return diff;
     }
     public static void main(String[] args) {
          int grid[][]={{1,1,1},{1,1,1}};
          onesMinusZeros(grid);
     }
}