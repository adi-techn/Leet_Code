public class lc_240 {
     public static boolean searchMatrix(int[][] matrix, int target) {
          int n=matrix.length-1;
          int m=matrix[0].length-1;
          for(int i=0;i<=n;i++){
              if(target<=matrix[i][m]){
                  int si=0;
                  int ei=m;
                  while(si<=ei){
                      int mid=(si+ei)/2;
                      if(target==matrix[i][mid]){
                          return true;
                      }
                      else if(target<matrix[i][mid]){
                          ei=mid-1;
                      }
                      else{
                          si=mid+1;
                      }
                  }
              }
          }
          return false;
     }
     public static void main(String[] args) {
          int matrix[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}};
          System.out.println(searchMatrix(matrix, 5));
     }
}
