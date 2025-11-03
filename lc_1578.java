public class lc_1578 {
     public static int minCost(String col,int time[]){
          int sum=0;
          for(int i=1;i<col.length();i++){
               if(col.charAt(i)==col.charAt(i-1)){
                    sum+=Math.min(time[i],time[i-1]);
                    time[i]=Math.max(time[i],time[i-1]);
               }
          }
          return sum;
     }
     public static void main(String[] args) {
          String colors="abaac";
          int time[]={1,2,3,4,5};
          System.out.println(minCost(colors, time));
     }
}
