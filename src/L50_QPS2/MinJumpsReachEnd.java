import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
         int n = arr.length;
        int jumps[] = new int[n];
        jumps[0] = 0;
        for(int i=1;i<n;i++){
            jumps[i] = Integer.MAX_VALUE;
            for(int j=0;j<i;j++){
                if(i<=(j+arr[j])){
                    jumps[i] = Math.min(jumps[i],jumps[j]+1);
                }
            }
        }
        System.out.println(jumps[n-1]);
    }
    
}