import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1,sum=0;
        for(int i=2;i<=n;i++){
            sum = a+b;
            a=b;
            b=sum;
        }
        System.out.println(sum);
    }
}