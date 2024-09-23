package LC;
import java.util.*;
public class lc_09{
    public static boolean main(String[] args) {
        int x=121;
        int r=0,m,j;
        m=x;
        while(x>0){
            j=x%10;
            r=j+r*10;
            x=x/10;
        }
        if(m==r){
            return true;
        }
        else{
            return false;
        }
    }   
}

