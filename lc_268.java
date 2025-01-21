import java.util.Arrays;

public class lc_268{
    public static int missingNum(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i!=arr[i]){
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[]={0,1};
        System.out.println(missingNum(arr));  
    }
}