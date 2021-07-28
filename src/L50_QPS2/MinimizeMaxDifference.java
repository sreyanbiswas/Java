import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 5, 15, 10} ;
        int k = 3;
        int n = arr.length;
        if(n==0){
            return;
        }
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int largest = arr[n-1]-k;
        int smallest = arr[0]+k;
        int mi,ma;
        for(int i=0;i<arr.length-1;i++){
            mi = Math.min(smallest,arr[i+1]-k);
            ma = Math.max(largest,arr[i]+k);
            if(mi<0){
                continue;
            }
            ans = Math.min(ans,ma-mi);
        }
        System.out.println(ans);
    }
}