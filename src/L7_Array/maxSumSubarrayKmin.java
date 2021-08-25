import java.util.*;
public class Main {
    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4 };
        int n = array.length;
        int K = 3;
        System.out.println(solve(array, n, K));
    }
    public static int solve(int arr[],int n,int k){
        int start=1;
        for(int i=0;i<n;i++){
            if(arr[i]>start){
                start = arr[i];
            }
        }
        int end=0;
        for(int i=0;i<n;i++){
            end += arr[i];
        }
        int answer = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(check(mid,arr,n,k)){
                answer = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return answer;
    }
    public static boolean check(int mid,int arr[],int n,int k){
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>mid){
                return false;
            }
            sum += arr[i];
            if(sum>mid){
                count++;
                sum = arr[i];
            }
        }
        count++;
        if(count<=k){
            return true;
        }
        return false;
    }
}