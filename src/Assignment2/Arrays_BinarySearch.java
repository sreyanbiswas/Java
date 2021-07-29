import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int idx=-1;
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi){
			int mid = (lo+hi)/2;
			if(arr[mid]==d){
				idx=mid;
				break;
			}else if(arr[mid]>d){
				hi = mid-1;
			}else if(arr[mid]<d){
				lo = mid+1;
			}
		}
		System.out.println(idx);
    }
}