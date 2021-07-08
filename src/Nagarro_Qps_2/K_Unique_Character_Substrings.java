package Nagarro_Qps_2;

import java.util.Scanner;

public class K_Unique_Character_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			int arr[] = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
				
			}
			for (int pass = 1; pass <n; pass++) {
				for (int i = 0; i <=n-pass-1; i++) {
					// sawp
					if(isPossible(arr[i],arr[i+1])) {
						int temp = arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
					
				}
				
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			t--;
		}

	}
// 98 9
	public  static boolean isPossible(int n1, int n2) {
		// TODO Auto-generated method stub
		String s1= ""+n1;
		String s2= ""+n2;
		long n1n2=Long.parseLong(s1+s2);// 989
		long n2n1=Long.parseLong(s2+s1);// 998
		if(n2n1>n1n2) {
			return true;
		}
		
		return false;
	}

}
