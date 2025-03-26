public class lc_2079{
     public static int wateringPlants(int[] plants, int cap) {
          int s=0,maxcap=cap;
          for(int i=-1;i<plants.length-1;i++){
               if(cap>=plants[i+1]){
                    s++;
                    cap-=plants[i+1];
               }else{
                    s+=((i+1)*2);
                    i--;
                    cap=maxcap;
               }
          }
          return s;
     }     
     public static void main(String[] args) {
          int arr[]={7,7,7,7,7,7,7};
          System.out.println(wateringPlants(arr, 8));
     }
}