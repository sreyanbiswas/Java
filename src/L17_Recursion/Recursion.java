package L17_Recursion;

public class Recursion {

	public static void main(String[] args) {

//		System.out.println("hello");
//		PDI(3);
//		System.out.println("bye");

//		System.out.println(factorial(4));
//		System.out.println(power(3, 7));

//		System.out.println(fibonacci(4));

		ruler(3, 3);

	}

	// n -> 1 counting
	public static void PD(int n) {

		// base case
		if (n == 0)
			return;

		// work : n print
		System.out.println(n);

		// n-1 -> 1 counting
		PD(n - 1);
	}

	// BP : 1 -> n
	public static void PI(int n) {

		if (n == 0)
			return;

		// SP : 1 -> n-1
		PI(n - 1);

		// Work : n print
		System.out.println(n);
	}

	public static void PDI(int n) {

		if (n == 0)
			return;

		System.out.println("hii " + n);
		PDI(--n);
		System.out.println("bye " + n);

	}

	// BP : start->n n-> start
	public static void PID(int start, int n) {

		if (start == n + 1)
//		if(start > n)
			return;

		System.out.println(start);

		// SP : start+1->n n->start+1
		PID(start + 1, n);

		System.out.println(start);
	}
	
	public static boolean isSorted(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] > arr[si + 1]) {
			return false;
		} else {
			boolean restAns = isSorted(arr, si + 1);
			return restAns;
		}
	}
	
	public static void pattern3(int N, int row, int col) {
		if (row > N) {
			return;
		}

		if (col > row) {
			System.out.println();
			pattern3(N, row + 1, 1);
			return;
		}

		System.out.print("*\t");
		pattern3(N, row, col + 1);
	}
	
	public static void bubbleSort(int[] arr, int si, int li) {
		if (li == 0) {
			return;
		}
		if (si == li) {
			bubbleSort(arr, 0, li - 1);
			return;
		}
		if (arr[si] > arr[si + 1]) {
			int temp = arr[si];
			arr[si] = arr[si + 1];
			arr[si + 1] = temp;
		}
		bubbleSort(arr, si + 1, li);
	}
	
	

	// BP : n!
	public static int factorial(int n) {

		// Base Case
		if (n == 0)
			return 1;

		// SP : (n-1)!
		int fnm1 = factorial(n - 1);

		// Self Work
		int fn = fnm1 * n;

		return fn;

//		return factorial(n-1) * n ;
	}

	public static int power(int b, int e) {

		if (e == 0)
			return 1;

		int sp = power(b, e - 1);
		int bp = sp * b;

		return bp;

	}
	
	public static int power2(int x, int n) {
		
		if(n == 0)
			return 1 ;
		
		int sp = power2(x,n/2) ;
		
		int bp ;
		
		if(n % 2 == 0) 
			bp = sp * sp ;
		else
			bp = sp * sp * x ;
		
		return bp ;
	}

	public static int fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);

		int fn = fnm1 + fnm2;

		return fn;
	}

	public static void pattern(int tl) {

		if (tl == 0)
			return;

		// sp
		pattern(tl - 1);

		// work
		for (int i = 1; i <= tl; i++)
			System.out.print("- ");
		System.out.println();

		// sp
		pattern(tl - 1);

	}

	public static void ruler(int inch, int mtl) {

		for (int j = 1; j <= mtl; j++)
			System.out.print("- ");
		System.out.println(0);

		for (int i = 1; i <= inch; i++) {

			pattern(mtl - 1);

			for (int j = 1; j <= mtl; j++)
				System.out.print("- ");
			System.out.println(i);

		}
	}

}
