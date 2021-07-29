import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=2*n-1;
        pattern(n1);
    }
    public static void pattern(int n){
         int nst = (n/2) + 1;
         int nsp = -1;
        int rows = 1;
        while(rows <= n){

             int cst = 1;
            while(cst <= nst){

                System.out.print("*");
                cst++;
            }

            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }

            cst = 1;
            if(rows == 1 || rows == n) cst = 2; //To handle extra Star

            while(cst <= nst){

                System.out.print("*");
                cst++;
            }



            if(rows <= n/2){ //Update
                nsp += 2;
                nst--;
            }else{
                nsp -= 2;
                nst++;
            }
            rows++;
            System.out.println();
        }
    }
}