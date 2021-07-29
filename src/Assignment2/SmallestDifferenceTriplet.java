import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1[] = new int[n];
        int a2[] = new int[n];
        int a3[] = new int[n];
        for(int i=0;i<n;i++){
            a1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            a2[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            a3[i] = sc.nextInt();
        }
        int t = a1.length;
        smallestDifferenceTriplet(a1,a2,a3,t);
    }
    
    public static int maximum(int a, int b, int c) 
    { 
        return Math.max(Math.max(a, b), c); 
    } 
      
   
    public static int minimum(int a, int b, int c) 
    { 
        return Math.min(Math.min(a, b), c); 
    } 
      
   
    public static void smallestDifferenceTriplet(int arr1[], int arr2[], int arr3[], int n) 
    { 
          
        
        Arrays.sort(arr1); 
        Arrays.sort(arr2); 
        Arrays.sort(arr3); 
      
       
        int res_min=0, res_max=0, res_mid=0; 
      
      
        int i = 0, j = 0, k = 0; 
      
      
        int diff = 2147483647; 
          
        while (i < n && j < n && k < n) 
        { 
            int sum = arr1[i] + arr2[j] + arr3[k]; 
      
            
            int max = maximum(arr1[i], arr2[j], arr3[k]); 
      
           
            int min = minimum(arr1[i], arr2[j], arr3[k]); 
            if (min == arr1[i]) 
                i++; 
            else if (min == arr2[j]) 
                j++; 
            else
                k++; 
      
           
            if (diff > (max - min)) 
            { 
                diff = max - min; 
                res_max = max; 
                res_mid = sum - (max + min); 
                res_min = min; 
            } 
        } 
      
       
        System.out.print(res_max + " " + res_mid + " " + res_min); 
    } 
}