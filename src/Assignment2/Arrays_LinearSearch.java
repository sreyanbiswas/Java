import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int idx=-1;
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==d){
				idx=i;
				break;
			}
		}
		System.out.println(idx);
    }
}