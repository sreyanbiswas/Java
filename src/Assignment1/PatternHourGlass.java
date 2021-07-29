import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = (2*n)+1;
		int val=n;
		int nsp=0;
		int row=1;
		int nr=(2*n)+1;
		while(row<=nr){
			int temp=val;
			for(int csp=1;csp<=nsp;csp++){
				System.out.print("  ");
			}
			for(int cst=1;cst<=nst;cst++){
				System.out.print(temp+" ");
				if(cst<=nst/2){
					temp--;
				}else{
					temp++;
				}
			}
			System.out.println();
			if(row<=nr/2){
				nsp++;
				nst = nst-2;
				val--;
			}else{
				nsp--;
				nst = nst+2;
				val++;
			}
			row++;
		}
    }
}