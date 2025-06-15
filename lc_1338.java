import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class lc_1338 {
     public static int minSetSize(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int x:hm.values()){
            pq.add(x);
        }
        int count=0;
        while(n>(arr.length/2)){
            n-=pq.remove();
            count++;
        }
        return count;
     }
     public static void main(String[] args) {
          int arr[]={7,7,7,7,7,7,7,7};
          System.out.println(minSetSize(arr));
     }
}
