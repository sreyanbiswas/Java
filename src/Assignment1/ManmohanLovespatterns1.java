import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst=1;
		int row=1;
		while(row<=n){
			for(int cst=1;cst<=nst;cst++){
				if(row%2!=0){
					System.out.print(1);
				}else{
					if(cst==1 || cst==nst){
						System.out.print(1);
					}else{
						System.out.print(0);
					}
				}
			}
			System.out.println();
			nst++;
			row++;
		}
    }
}