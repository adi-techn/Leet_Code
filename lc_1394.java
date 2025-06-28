import java.util.HashMap;
public class lc_1394 {
     public static int findLucky(int[] arr) {
        int max=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(int key:hm.keySet()){
            if(key==hm.get(key)){
                max=(max < key)?key:max;
            }
        }
        return max;
     }
     public static void main(String[] args) {
          int arr[]={1,2,2,3,3,3};
          System.out.println(findLucky(arr));
     }
}
