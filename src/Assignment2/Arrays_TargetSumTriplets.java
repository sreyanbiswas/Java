import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		Arrays.sort(arr);
		int left;
		int right;
		int sum;
		for(int i=0;i<arr.length-2;i++){
			left = i+1;
			right = arr.length-1;
			sum=0;
			while(left<right){
				sum = arr[i]+arr[left]+arr[right];
				if(sum==d){
					System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);
					left++;
					right--;
				}else if(sum<d){
					left++;
				}else if(sum>d){
					right--;
				}
			}
		}
    }
}