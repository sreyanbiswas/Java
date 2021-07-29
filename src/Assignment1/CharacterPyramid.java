import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int nst=1;
        int row=1;
        char val1;
        char val2;
        while(row<=n){
            val1='a';
            val2='b';
            for(int cst=1;cst<=nst;cst++){
                if(row%2==0){
                    System.out.print(val2+" ");
                    val2 = (char)(val2+2);
                }else{
                    System.out.print(val1+" ");
                    val1 = (char)(val1+2);
                }
            }
            System.out.println();
            row++;
            nst++;
        }
    }
}