import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		int sum=0;
		while(left<right){
			sum=arr[left]+arr[right];
			if(sum==d){
				System.out.println(arr[left]+" and "+arr[right]);
				left++;
				right--;
			}
			else if(sum>d){
				right--;
			}else if(sum<d){
				left++;
			}
		}
    }
}