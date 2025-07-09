import java.util.Arrays;
import java.util.HashMap;

public class lc_2007 {
     public static int[] findOriginalArray(int[] changed) {
        int n=changed.length;

        int emp[]=new int[0];
        if(n%2 != 0){
            return emp;
        }
        int res[]=new int[n/2];

        Arrays.sort(changed);
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        int idx=0;
        for(int i=n-1;i>=0;i--){
            if(hm.containsKey(2*changed[i])){
                if(hm.get(2*changed[i])==1){
                    hm.remove(2*changed[i]);
                }else{
                    hm.put(2*changed[i],hm.get(2*changed[i])-1);
                }
                res[idx++]=changed[i];
            }else{
                hm.put(changed[i],hm.getOrDefault(changed[i],0)+1);
            }
        }
        return idx==n/2?res: emp;
     }
     public static void main(String[] args) {
          int arr[]={1,3,4,2,6,8};
          for(int x:findOriginalArray(arr)){
               System.out.print(x+" ");
          }
     }
}
