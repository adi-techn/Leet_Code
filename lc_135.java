import java.util.*;

public class lc_135 {
	public static int totalCandy(int arr[]){
		int n=arr.length;
		int candy[]=new int[n];

		Arrays.fill(candy,1);
		
		for(int i=1;i<n;i++){
			if(arr[i]>arr[i-1]){
				candy[i]=candy[i-1]+1;
			}
		}
		for(int i=n-2;i>=0;i--){
			if(arr[i]>arr[i+1]){
				candy[i]=Math.max(candy[i],candy[i+1]+1);
			}
		}
		int tot=0;
		for(int x:candy){
			tot+=x;
		}
		return tot;
	}
	public static void main(String args[]){
		int arr[]={1,3,4,5,2};
		System.out.println("Total Candy: "+totalCandy(arr));
	}
}