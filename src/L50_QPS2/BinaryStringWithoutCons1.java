import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cons1(n+2));
    }
    public static int cons1(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1 = cons1(n-1);
        int fib2 = cons1(n-2);
        return fib1+fib2;
    }
}