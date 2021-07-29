import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
     public static void pattern(int n){

        int rows = 1;
        int nst = 1;

        while(rows <= n){

            int cst = 1;
            while(cst <= nst){

                if(cst == 1 || cst == nst)  
                 System.out.print(rows+"\t"); 
                 else
                 System.out.print(0+"\t"); 
                cst++;
            }

            System.out.println();
            rows++;
            nst++;
        }
    }
}