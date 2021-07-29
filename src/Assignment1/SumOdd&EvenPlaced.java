import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1=0;
        int sum2=0;
        int i=1;
        while(n!=0){
            int rem=n%10;
            if(i%2!=0){
                sum1=sum1+rem;
            }else{
                sum2=sum2+rem;
            }
            n = n/10;
            i++;
        }
        System.out.println(sum1);
        System.out.println(sum2);
            }
}