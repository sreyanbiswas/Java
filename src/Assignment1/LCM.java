import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l = (a>b)?a:b;
        while(true){
            if(l%a==0 && l%b==0){
                System.out.println(l);
                break;
            }
            l++;
        }
    }
}