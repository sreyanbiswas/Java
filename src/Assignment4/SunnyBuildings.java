import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int t1=1;t1<=t;t1++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(countBuildings(arr,n));
        }
    }

    static int countBuildings(int arr[], int n)
    {
        int count = 1;
 
        int curr_max = arr[0];
        for (int i = 1; i < n; i++) {
           
           
            if (arr[i] > curr_max || arr[i] == curr_max) {
                count++;
                curr_max = arr[i];
            }
        }
 
        return count;
    }
}