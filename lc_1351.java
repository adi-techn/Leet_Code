public class lc_1351{
     public static int search(int grid[][]) {
         int rows=grid.length;
         int row=0,col=grid[0].length-1;
         int c=0;
         while(row<rows && col>=0){
             if(grid[row][col]>=0){
                 row++;
             }
             else{
                 c+=rows-row;
                 col--;
             }
         }
         return c;
         // int t=-1,c=0;
         // for(int i=0;i<grid.length;i++){
         //     for(int j=0;j<grid[0].length;j++){
         //         if(grid[i][j]<=t){
         //             c++;
         //         }
         //     }
         // }
         // return c;
     }
     public static void main(String[] args) {
         int arr[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
         System.out.println(search(arr));
     }
 }