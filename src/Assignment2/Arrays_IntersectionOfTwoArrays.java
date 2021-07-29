import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n1;i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(intersection(arr1,arr2));
    }
    public static ArrayList<Integer> intersection(int arr1[],int arr2[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}