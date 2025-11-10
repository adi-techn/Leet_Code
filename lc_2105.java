public class lc_2105 {
     public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
          int a = capacityA, b = capacityB;
          int cnt = 0;
          int si = 0, ei = plants.length - 1;

          while (si < ei) {
               if (plants[si] > a) {
                    cnt++;
                    a = capacityA;
               }
               if (plants[ei] > b) {
                    cnt++;
                    b = capacityB;
               }
               a -= plants[si];
               b -= plants[ei];
               si++;
               ei--;
          }
          if (si == ei) {
               if (a >= b && plants[si] <= a) {
                    a -= plants[si];
               } else if (a >= b && plants[si] > a) {
                    a = capacityA;
                    cnt++;
               } else if (a < b && plants[ei] <= b) {
                    b -= plants[ei];
               } else {
                    b = capacityB;
                    cnt++;
               }
          }

          return cnt;
     }

     public static void main(String[] args) {
          int plants[]={2,2,3,3};
          int capacityA=5,capacityB=5;
          System.out.println(minimumRefill(plants, capacityA, capacityB));
     }
}
