import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp[] = arr.clone();
        Arrays.sort(temp);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=temp[i]){
                count++;
                swap(arr,i,indexOf(arr,temp[i]));
            }
        }
        System.out.println(count);
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int indexOf(int arr[],int e){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==e){
                return i;
            }
        }
        return -1;
    }
}