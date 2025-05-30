import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lc_2150 {
     public static List<Integer> findLonely(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int x:hm.keySet()){
            if(hm.containsKey(x-1) || hm.containsKey(x+1) || hm.get(x)!=1){
                continue;
            }else{
                res.add(x);
            }
        }
        return res;
     }
     public static void main(String[] args) {
          int arr[]={10,6,5,8};
          System.out.println(findLonely(arr));
     }
}
