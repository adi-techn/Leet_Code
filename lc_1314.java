public class lc_1314{
     public static int[][] matrixBlockSum(int[][] mat, int k) {
          int m=mat.length,n=mat[0].length;
          int ans[][]=new int[m][n];

          for(int i=0;i<m;i++){
               int rs=i-k,re=i+k;
               if(rs<0){
                    rs=0;
               }
               if(re>=m){
                    re=m-1;
               }
               for(int j=0;j<n;j++){
                    int cs=j-k,ce=j+k;
                    if(cs<0){
                         cs=0;
                    }
                    if(ce>=n){
                         ce=n-1;
                    }
                    int sum=0;
                    for(int r=rs;r<=re;r++){
                         for(int c=cs;c<=ce;c++){
                              sum+=mat[r][c];
                         }
                    }
                    ans[i][j]=sum;
               }
          }
          return ans;
     }
     public static void main(String[] args) {
          int grid[][]={{1,2,3},{4,5,6},{7,8,9}};
          matrixBlockSum(grid,1);
     }
}