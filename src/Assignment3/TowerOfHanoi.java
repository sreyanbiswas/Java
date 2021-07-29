import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TOH(n,"T1","T2","T3");
        System.out.println((int)(Math.pow(2,n))-1);
    }
	public static void TOH(int n,String src,String dest,String help){
		if(n==0){
			return;
		}
		TOH(n-1,src,help,dest);
		System.out.println("Move "+n+"th disc from "+src+" to "+dest);
		TOH(n-1,help,dest,src);
	}
}