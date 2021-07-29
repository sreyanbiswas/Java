import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=n;
        int row=1;
        int nsp = 0;
        while(row<=n){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
            }
            System.out.println();
            row++;
            nsp++;
            nst--;
        }
    }
}