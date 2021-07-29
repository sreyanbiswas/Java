import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = (int)Math.sqrt(n);
        boolean flag = true;
        for(int i=2;i<=d;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}