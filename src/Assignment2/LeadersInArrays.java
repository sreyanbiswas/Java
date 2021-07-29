import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        printLeaders(arr,n);
    }
     public static void printLeaders(int arr[], int size) 
    { 
        int max_from_right =  arr[size-1]; 
        System.out.print(max_from_right + " "); 
       
        for (int i = size-2; i >= 0; i--) 
        { 
            if (max_from_right <= arr[i]) 
            {            
            max_from_right = arr[i]; 
            System.out.print(max_from_right + " "); 
            } 
        }     
    } 
  
}
