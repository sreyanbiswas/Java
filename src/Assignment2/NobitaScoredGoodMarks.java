import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int t1=1;t1<=t;t1++){
            int n = sc.nextInt();
            int d = sc.nextInt();
            int p = n%d;
            int s = Math.min(p,d-p);
            System.out.println(s);
        }
    }
}