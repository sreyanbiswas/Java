import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nr=(2*n)-1;
        int nsp=n-1;
        int nst=1;
        int val;
        while(row<=nr){
            if(row<=n){
                val=row;
            }else{
                val=nr-row+1;
            }
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print(val+"\t");
                if(cst<=nst/2){
                    val++;
                }else{
                    val--;
                }
            }
            if(row<=nr/2){
                nsp=nsp-1;
                nst=nst+2;
            }else{
                nsp=nsp+1;
                nst=nst-2;
            }
            System.out.println();
            row++;
        }
    }
}