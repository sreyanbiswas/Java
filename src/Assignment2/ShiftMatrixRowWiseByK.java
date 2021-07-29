import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        shiftMatrixByK(arr,k,n);
    }
    static void shiftMatrixByK(int [][]mat, 
                                    int k,int N) 
    { 
        
           
        int j = 0; 
        while (j < N) { 
               
            // Print elements from index k 
            for (int i = k; i < N; i++) 
                System.out.print(mat[j][i] + " "); 
                   
            // Print elements before index k 
            for (int i = 0; i < k; i++) 
                System.out.print(mat[j][i] + " "); 
                   
            System.out.println(); 
            j++; 
        } 
    } 
}