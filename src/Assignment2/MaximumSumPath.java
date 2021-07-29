import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int t1=1;t1<=t;t1++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a11[] = new int[a1];
            int a22[] = new int[a2];
            for(int i=0;i<a1;i++){
                a11[i] = sc.nextInt();
            }
            for(int i=0;i<a2;i++){
                a22[i] = sc.nextInt();
            }
            System.out.println(maxPathSum(a11,a22,a1,a2));
        }
    }
    public static int maxPathSum(int ar1[], int ar2[], int m, int n)
    {
        // initialize indexes for ar1[] and ar2[]
        int i = 0, j = 0;
 
        // Initialize result and current sum through ar1[]
        // and ar2[].
        int result = 0, sum1 = 0, sum2 = 0;
 
        // Below 3 loops are similar to merge in merge sort
        while (i < m && j < n) 
        {
            // Add elements of ar1[] to sum1
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];
 
            // Add elements of ar2[] to sum2
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];
 
            // we reached a common point
            else
            {
                // Take the maximum of two sums and add to
                // result
                result += max(sum1, sum2);
 
                // Update sum1 and sum2 for elements after
                // this intersection point
                sum1 = 0;
                sum2 = 0;
 
                // Keep updating result while there are more
                // common elements
                int temp = i;
                while (i < m && ar1[i] == ar2[j])
                    sum1 += ar1[i++];
 
                while (j < n && ar1[temp] == ar2[j])
                    sum2 += ar2[j++];
 
                result += max(sum1, sum2);
 
                sum1 = 0;
                sum2 = 0;
            }
        }
 
        // Add remaining elements of ar1[]
        while (i < m)
            sum1 += ar1[i++];
 
        // Add remaining elements of ar2[]
        while (j < n)
            sum2 += ar2[j++];
 
        // Add maximum of two sums of remaining elements
        result += max(sum1, sum2);
 
        return result;
    }
    public static int max(int x, int y) { return (x > y) ? x : y; }
}