import java.util.ArrayList;
import java.util.List;

public class lc_1310 {
     public static List<Integer> xorQueries(int arr[],int queries[][]){
          ArrayList<Integer> ans=new ArrayList<>();

          for(int i=0;i<queries.length;i++){
               int left=queries[i][0];
               int right=queries[i][1];
               int xor=0;
               for(int j=left;j<=right;j++){
                    xor^=arr[j];
               }
               ans.add(xor);
          }

          return ans;
     }
     public static void main(String[] args) {
          int arr[]={1,3,4,8};
          int queries[][]={{0,1},{1,2},{0,3},{3,3}};
          System.out.println(xorQueries(arr, queries));
     }
}
