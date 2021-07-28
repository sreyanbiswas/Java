import java.util.*;
public class Main {
    static int count=0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        counting(0,n);
        System.out.println(count);
    }
    public static void counting(int start,int end){
        if(start==end){
            count++;
            return;
        }
        if(start>end){
            return;
        }
        counting(start+1,end);
        counting(start+3,end);
        counting(start+4,end);
    }
}