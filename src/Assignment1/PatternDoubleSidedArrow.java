import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp1 = n-1;
		int nsp2 = -1;
		int nst = 1;
		int val = 1;
		int row=1;
		while(row<=n){
			for(int csp=1;csp<=nsp1;csp++){
				System.out.print("  ");
			}
			for(int cst=val;cst>=1;cst--){
				System.out.print(cst+" ");
			}
			for(int csp=1;csp<=nsp2;csp++){
				System.out.print("  ");
			}
			int cst=1;
			if(row==1 || row==n){
				cst=2;
			}
			for(;cst<=val;cst++){
				System.out.print(cst+" ");
			}
			System.out.println();
			if(row<=n/2){
				nst++;
				nsp1=nsp1-2;
				nsp2 = nsp2+2;
				val++;
			}else{
				nst--;
				nsp1= nsp1+2;
				nsp2 = nsp2-2;
				val--;
			}
			row++;
		}
    }
}
