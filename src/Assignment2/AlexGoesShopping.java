import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			int p = sc.nextInt();
			int k = sc.nextInt();
			if(query(arr,p,k)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
    }
	public static boolean query(int arr[],int p,int k){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(p>=arr[i] && p%arr[i]==0){
				count++;
			}
		}
		if(count>=k){
			return true;
		}else{
			return false;
		}
	}
}
