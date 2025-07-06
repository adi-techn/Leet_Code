import java.util.PriorityQueue;

public class lc_2785 {
     public static String sortVowels(String s) {
        char str[]=new char[s.length()];
        PriorityQueue<Character> pq=new PriorityQueue<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                pq.add(ch);
            }
            else{
                str[i]=ch;
            }
        }
        for(int i=0;i<s.length();i++){
            if(str[i]==0){
                str[i]=pq.remove();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:str){
            sb.append(ch);
        }
        return sb.toString();
     }
     public static void main(String[] args) {
          String s = "lEetcOde";
          System.out.println(sortVowels(s));
     }
}
