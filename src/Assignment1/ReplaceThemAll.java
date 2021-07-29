import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String s = String.valueOf(n);
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                str = str+'5';
            }else{
                str = str+s.charAt(i);
            }
        }
        System.out.println(str);
    }
}