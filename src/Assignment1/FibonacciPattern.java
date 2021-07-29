import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
         int nst = 1;
        int rows = 1;
        int firstFibo = 0;
        int secondFibo = 1;
        while(rows <= n){


            int cst = 1;
            while(cst <= nst){
                System.out.print((firstFibo)+"\t");
                int thirdFibo = firstFibo + secondFibo; 
                firstFibo = secondFibo;  
                secondFibo = thirdFibo; 
                cst++;
            }

            rows++;
            nst++;
            System.out.println();
        }
    }
}