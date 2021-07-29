import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int count=0;
        while(n!=0){
            int digit = n%10;
            if(f==digit){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}