import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			int res[] = nextGreaterElement2(arr);
			for(int i=0;i<res.length;i++){
				System.out.println(arr[i]+","+res[i]);
			}

			t--;
		}

	}

	public static int[] nextGreaterElement2(int[] arr) {

		int[] ans = new int[arr.length];

		Stack<Integer> s = new Stack<>();

		// go to every element
		for (int i = 0; i < arr.length; i++) {

			// arr[i] want to be next greater
			while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
				ans[s.pop()] = arr[i];
			}

			// push index i
			s.push(i);
		}

		// if some values are left in stack, then there nge is -1
		while (!s.isEmpty()) {
			ans[s.pop()] = -1;
		}

		return ans;

	}
}
