import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst=1;
		int row=1;
		int val;
		while(row<=n){
			if(row==1){
				val=1;
			}else{
				val=row-1;
			}
			for(int cst=1;cst<=nst;cst++){
				if(cst==1 || cst==nst){
					System.out.print(val);
				}else{
					System.out.print(0);
				}
			}
			System.out.println();
			nst++;
			row++;
		}
    }
}