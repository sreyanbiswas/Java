import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int t1=1;t1<=t;t1++){
            String str = sc.next();
            System.out.println(decInc(str));
        }
    }
    public static String decInc(String str){
        String ans="";
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<=str.length();i++){
            s.add(i+1);
            if(i==str.length() || str.charAt(i)=='I'){
                while(!s.isEmpty()){
                    ans += String.valueOf(s.peek());
                    s.pop();
                }
            }
        }
        return ans;
    }
}