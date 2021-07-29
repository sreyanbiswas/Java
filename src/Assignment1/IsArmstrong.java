import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p=n;
		int c=0;
		while(p!=0){
			int r = p%10;
			c++;
			p = p/10;
		}
		int k = n;
		int sum=0;
		while(k!=0){
			int r = k%10;
			sum = sum+(int)Math.pow(r,c);
			k = k/10;
		}
		if(sum==n){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
    }
}