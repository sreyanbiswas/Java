import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        count(arr,k);
    }
    public static void count(int arr[],int k){
        int count=0;
        for(int i:arr){
            int times=i/k;
            count+=times;
            if(i%k!=0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}