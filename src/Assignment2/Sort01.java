import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[count++] = arr[i];
            }
        }
        while(count<n){
            arr[count++] = 1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}