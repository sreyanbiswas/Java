import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int t1=1;t1<=t;t1++){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<arr.length;i++){
				arr[i] = sc.nextInt();
			}
			System.out.println(maxsum(arr));
		}
    }
	public static int maxsum(int arr[]){
		int kad = kadanes(arr);
		int max_wrap = 0;
		for(int i=0;i<arr.length;i++){
			max_wrap += arr[i];
			arr[i] = -arr[i];
		}
		int max_ncontib = kadanes(arr);
		max_wrap = max_wrap+max_ncontib;
		if(kad>max_wrap){
			return kad;
		}else{
			return max_wrap;
		}
	}
	public static int kadanes(int arr[]){
		int maxsf = Integer.MIN_VALUE;
		int maxeh = 0;
		for(int i=0;i<arr.length;i++){
			maxeh = maxeh+arr[i];
			if(maxeh>maxsf){
				maxsf = maxeh;
			}
			if(maxeh<0){
				maxeh=0;
			}
		}
		return maxsf;
	}
}