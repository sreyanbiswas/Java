import java.util.*;
public class Main {
    static int total=0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int t1=1;t1<=t;t1++){
            String str = sc.next();
            int count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='?'){
                    count++;
                }
            }
            total = (int)Math.pow(2,count);
            permutations(str,"");
        }
    }
    public static void permutations(String str,String ans){
        if(str.length()==0){
            total--;
            if(total!=0){
            System.out.print(ans+" ");
            }else{
                System.out.println(ans+" ");
            }
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        if(ch=='?'){
            permutations(ros,ans+"0");
            permutations(ros,ans+"1");
        }else{
            permutations(ros,ans+ch);
        }
    }
}