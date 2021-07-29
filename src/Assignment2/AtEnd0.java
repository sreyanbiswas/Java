import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[n];
		int count=0;
		int j=0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
			if(arr[i]!=0){
				temp[j] = arr[i];
				j++;
			}else{
				count++;
			}
		}
		for(int i=j;i<count;i++){
			temp[i] = 0;
		}
		for(int val:temp){
			System.out.print(val+" ");
		}
    }
}