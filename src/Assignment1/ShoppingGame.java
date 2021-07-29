import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int t1=1;t1<=t;t1++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int s=0,s1=0;
            for(int i=1;;i++){
                if(i%2==1){
                    s=s+i;
                }else{
                    s1=s1+i;
                }
                if(s>a){
                    System.out.println("Harshit");
                    break;
                }else if(s1>b){
                    System.out.println("Aayush");
                    break;
                }
            }
        }
    }
}
