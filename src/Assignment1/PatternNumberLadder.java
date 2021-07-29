import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int val=1;
        while(row<=n){
            for(int cst=1;cst<=row;cst++){
                System.out.print(val+"\t");
                val++;
            }
            System.out.println();
            row++;
        }
    }
}
