import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int tem[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			tem[arr[i]] = i;
		}
		for(int i=0;i<n;i++){
			System.out.print(tem[i]+" ");
		}
    }
}