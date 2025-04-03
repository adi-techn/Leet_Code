import java.util.*;

public class lc_1288{
     public static int removeCoveredIntervals(int[][] intervals) {
          Arrays.sort(intervals,(a, b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
          int c=0;
          int lastEnd=0;
          for(int i=0; i<intervals.length; i++) {
               if(intervals[i][1]>lastEnd) {
                    c++;
                    lastEnd=intervals[i][1];
               }
          }
          return c;
     }

    public static void main(String[] args) {
        int arr[][]={{1,10},{2,5},{3,7},{4,6}};
        System.out.println(removeCoveredIntervals(arr));
    }
}