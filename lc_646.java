import java.util.Arrays;
import java.util.Comparator;

public class lc_646{
     public static int maxLenChainPair(int first[],int second[]){
          int mat[][]=new int[first.length][2];
          
          for(int i=0;i<mat.length;i++){
               mat[i][0]=first[i];
               mat[i][1]=second[i];
          }

          //Lamda Function
          Arrays.sort(mat,Comparator.comparingDouble(o->o[1]));

          int maxLen=1;
          int lastNum=mat[0][1];
          for(int i=1;i<mat.length;i++){
               if(mat[i][0]>lastNum){
                    maxLen++;
                    lastNum=mat[i][1];
               }
          }
          return maxLen;
     }
     public static void main(String[] args) {
          int ft[]={5,39,5,27,50};
          int snd[]={24,60,28,40,90};
          System.out.println(maxLenChainPair(ft, snd));
     }
}
