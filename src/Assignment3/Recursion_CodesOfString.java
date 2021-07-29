import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        ArrayList<String> list = new ArrayList<>();
        codes(n,"",list);
        System.out.println(list);
    }
    public static void codes(String str,String ans,ArrayList<String> list){
        if(str.length()==0){
            list.add(ans);
            return;
        }
        for(int i=1;i<=str.length();i++){
            String part = str.substring(0,i);
            String ros = str.substring(i);
            int val = Integer.parseInt(part);
            if(val+96<=122){
                codes(ros,ans+(char)(val+96),list);
            }
        }
    }
}