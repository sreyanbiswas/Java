import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TOH(n,"A","B","C");
    }
	public static void TOH(int n,String src,String dest,String help){
		if(n==0){
			return;
		}
		TOH(n-1,src,help,dest);
		System.out.println("Moving ring "+n+" from "+src+" to "+dest);
		TOH(n-1,help,dest,src);
	}
}
