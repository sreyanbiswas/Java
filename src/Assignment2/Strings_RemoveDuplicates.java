import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){

            }else{
                ans += str.charAt(i);
            }
        }
        ans += str.charAt(str.length()-1);
        System.out.println(ans);
    }
}