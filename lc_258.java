package LC;
import java.util.*;
public class lc_258{
    public static void main(String[] args) {
        int num,sum=0;
        System.out.print("Enter the number::");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int m=num;
        while(String.valueOf(m).length()!=1){
            sum+=(num%10);
            num=num/10;
            if(num==0 && (String.valueOf(sum).length()==1) ){
                break;
            }
            if(num==0){
                num=sum;
                sum=0;
                m=num;
            }
        }
        System.out.println("Sum of given digit::"+sum);
    }
}