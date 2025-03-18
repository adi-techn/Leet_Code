import java.util.LinkedList;
import java.util.Queue;

public class lc_933 {
     static class RecentCounter {
          private Queue<Integer> q;
          public RecentCounter() {
               q=new LinkedList<>();
          }
    
          public int ping(int t) {
               q.add(t);
               while(q.peek() < t - 3000){
                    q.poll();
               }    
               return q.size();
          }
     }
     public static void main(String[] args) {
          RecentCounter rc=new RecentCounter();
          System.out.println(rc.ping(1));
          System.out.println(rc.ping(100));
          System.out.println(rc.ping(3001));
          System.out.println(rc.ping(3002));
     }
}
