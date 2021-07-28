import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int t1=1;t1<=t;t1++){
            int rotis = sc.nextInt();
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int lo=0;
            int hi=1000;
            int ans=0;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                if(isItPossible(arr,mid,rotis)){
                    ans=mid;
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }
            System.out.println(ans);
        }
    }
    public static boolean isItPossible(int arr[],int mid,int rotis){
        int rot=0
        for(int i=0;i<arr.length;i++){
            int time = arr[i];
            int j=2;
            while(time<=mid){
                rot++;
                time += (arr[i]*j);
                j++;
            }
            if(rot>=rotis){
                return true;
            }
        }
        return false;
    }
}