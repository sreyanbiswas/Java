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
			int d = sc.nextInt();
			roses(arr,d);
		}
    }

	public static void roses(int[] arr, int target){

        Arrays.sort(arr);

        int fl = 0;  
       int fr = 0;    
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                fl = left;
                fr = right;

                left++;
                right--;
            }

        }

        System.out.println("Deepak should buy roses whose prices are " + arr[fl] + " and " + arr[fr] + ".");

    }
 
}