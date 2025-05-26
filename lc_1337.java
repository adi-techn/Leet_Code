import java.util.ArrayList;
import java.util.Collections;

public class lc_1337 {
     public static int[] kWeakestRows(int[][] mat, int k) {
        int sol[]=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    sum+=1;
                }else{
                    break;
                }
            }
            sol[i]=sum;
        }

        ArrayList<Integer> idx=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            idx.add(i);
        }
        Collections.sort(idx,(a,b)->{
            if(sol[a]==sol[b]){
                return a-b;
            }
            return sol[a]-sol[b];
        });
        int result[]=new int[k];
        for(int i=0;i<k;i++){
            result[i]=idx.get(i);
        }
        return result;
     }
     public static void main(String[] args) {
          int mat[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
          kWeakestRows(mat, 2);
     }
}
