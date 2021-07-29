import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int nsp=2*n-3;    
        int nst=1;       

        for(int i=1;i<=n;i++)
        {
            int num=1;
           
            for(int cst=1;cst<=nst;cst++)
            {
                if(cst!=n)
                System.out.print(num+"\t");

                num++;
            }

           
            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print(" \t");
            }

            
            for(int cst=num-1;cst>=1;cst--)
            {
                System.out.print(cst+"\t");
            }

            

            nsp=nsp-2;
            nst++;
            System.out.println();
        }
    }
}