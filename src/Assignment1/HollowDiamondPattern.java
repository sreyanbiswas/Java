import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
     public static void pattern(int n){
         int nst = (n/2) + 1;
         int nsp = -1;
        int rows = 1;
        while(rows <= n){

             int cst = 1;
            while(cst <= nst){

                System.out.print("*\t");
                cst++;
            }

            int csp = 1;
            while(csp <= nsp){
                System.out.print(" \t");
                csp++;
            }

            cst = 1;
            if(rows == 1 || rows == n) cst = 2; //To handle extra Star

            while(cst <= nst){

                System.out.print("*\t");
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