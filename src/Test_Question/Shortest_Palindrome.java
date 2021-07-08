package Test_Question;
import java.util.*;

public class Shortest_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println(	ShortestPalindrome("abcd"));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		int n = sc.nextInt();
		int [] arr = new int [n];
		System.out.println(sunny_bulding(arr));
		t--;
		}

	}
	public static int sunny_bulding(int []arr) {
		int max = Integer.MIN_VALUE;
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=max) {
				max=arr[i];
				ans++;
			}
		}
		return ans;
	}
	public static String ShortestPalindrome(String s) {
		String r = new StringBuilder(s).reverse().toString();
		int n =s.length();
		for (int i = 0; i < n; i++) {
			if(r.substring(i).equals(s.substring(0, n-i))){
				return r.substring(0, i)+s;
			}
		}
		return "";
	}
	

}
