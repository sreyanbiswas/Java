import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            return;
        }
        String arr[] = new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }
        String prefix = arr[0];
        for(int i=1;i<n;i++){
            prefix = commonPrefix(prefix,arr[i]);
        }
        if(prefix.length()==0){
            System.out.println("");
        }else{
            System.out.println(prefix);
        }
    }
    public static String commonPrefix(String s1,String s2){
        String ans="";
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)!=s2.charAt(j)){
                break;
            }else{
                ans += s1.charAt(i);
            }
            i++;
            j++;
        }
        return ans;
    }
}
