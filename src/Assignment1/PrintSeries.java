import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum=0;
        int count=1;
        int i=1;
        while(count<=n1){
            sum = (3*i)+2;
            if(sum%n2!=0){
                System.out.println(sum);
                count++;
            }
            i++;
        }
    }
}