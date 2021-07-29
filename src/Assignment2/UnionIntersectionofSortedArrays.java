import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr1[] = new int[m];
        for(int i=0;i<m;i++){
            arr1[i] = sc.nextInt();
        }
        int n1 = removeDuplicates(arr,n);
        int n2 = removeDuplicates(arr1,m);
        printUnion(arr,arr1,n1,n2);
        System.out.println();
        printIntersection(arr,arr1,n1,n2);
    }
    public static void printUnion(int arr1[], int arr2[], int m, int n) 
    { 
        int i = 0, j = 0; 
        while (i < m && j < n) { 
            if (arr1[i] < arr2[j]) 
                System.out.print(arr1[i++] + " "); 
            else if (arr2[j] < arr1[i]) 
                System.out.print(arr2[j++] + " "); 
            else { 
                System.out.print(arr2[j++] + " "); 
                i++; 
            } 
        } 
        while (i < m) 
            System.out.print(arr1[i++] + " "); 
        while (j < n) 
            System.out.print(arr2[j++] + " "); 
    }
    public static void printIntersection(int arr1[], int arr2[], int m, int n) 
    { 
        int i = 0, j = 0; 
        while (i < m && j < n) { 
            if (arr1[i] < arr2[j]) 
                i++; 
            else if (arr2[j] < arr1[i]) 
                j++; 
            else { 
                System.out.print(arr2[j++] + " "); 
                i++; 
            } 
        } 
    }
    public static int removeDuplicates(int arr[], int n) 
    { 
        
       
        int[] temp = new int[n]; 
          
        // Start traversing elements 
        int j = 0; 
        for (int i=0; i<n-1; i++) 
            // If current element is not equal 
            // to next element then store that 
            // current element 
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
          
        // Store the last element as whether 
        // it is unique or repeated, it hasn't 
        // stored previously 
        temp[j++] = arr[n-1];    
          
        // Modify original array 
        for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
       
        return j; 
    }

}