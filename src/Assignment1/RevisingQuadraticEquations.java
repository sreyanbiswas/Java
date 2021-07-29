import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = (b*b) - (4*a*c);
		if(d<0){
			System.out.println("Imaginary");
			return;
		}else if(d==0){
			System.out.println("Real and Equal");
		}else{
			System.out.println("Real and Distinct");
		}
		int root1 = (-b-(int)Math.sqrt(d))/(2*a);
		int root2 = (-b+(int)Math.sqrt(d))/(2*a);
		System.out.println(root1+" "+root2);
    }
}