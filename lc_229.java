import java.util.*;

public class lc_229 {
    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }
            else{
                hm.put(x,1);
            }
        }
        int n=nums.length/3;
        Set<Integer> keys=hm.keySet();
        for(Integer x:keys){
            if(hm.get(x)>n){
                arr.add(x);
            }
        }
        return arr;
     }
     public static void main(String[] args) {
          int nums[]={3,2,3};
          majorityElement(nums);
     }
}
