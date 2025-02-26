import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;
public class lc_1441{
    public static ArrayList<String> buildArray(int[] target, int n) {
        ArrayList<String> arr=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        int k=1,i=0;
        while (k<=target[target.length-1]) {
            s.push(k++);
            if(s.peek()!=target[i]){
                s.pop();
                arr.add("Push");
                arr.add("Pop");
            }
            else{
                arr.add("Push");
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2};
        System.out.println(buildArray(arr, 4));
    }
}