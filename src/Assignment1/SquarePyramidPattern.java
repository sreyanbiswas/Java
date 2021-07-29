import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=1;
        int row=1;
        while(row<=n){
            for(int cst=1;cst<=nst;cst++){
                System.out.print((int)Math.pow(cst,2)+" ");
            }
            System.out.println();
            row++;
            nst++;
        }
    }
}