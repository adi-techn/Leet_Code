import java.util.Arrays;
import java.util.Comparator;

public class lc_56 {
     public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingDouble(o -> o[0]));

        int c=0;
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1]>=intervals[i+1][0]){
                c++;
            }
        }
        int arr[][]=new int[intervals.length-c][2];
        int j=0;
        for(int i=0;i<intervals.length;i++){
            if (j > 0 && arr[j - 1][1] >= intervals[i][0]) {
                arr[j - 1][1] = Math.max(arr[j - 1][1], intervals[i][1]);
            } 
            else {
                arr[j][0] = intervals[i][0];
                arr[j][1] = intervals[i][1];
                j++;
            }
        }
        return Arrays.copyOf(arr, j);
     }
     public static void main(String[] args) {
          int arr[][]={{1,4},{4,5}}
          merge(arr);
     }
}
