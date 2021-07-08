package Nagarro_Doubt_Class;

import java.util.Scanner;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0)
		{
			int n = sc.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			next_Greater(arr);
			System.out.println();
			
		}
	}

	public static void next_Greater(int[] arr) {
		int p = 0;
		int q = 0;
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
		}
		for(int i=arr.length-1; i>p; i--) {
			if(arr[p]<arr[i]) {
				q=i;
				break;
			}
		}
		if(p==0 && q==0) {
			for (int i = arr.length-1; i>=0; i--) {
				System.out.print(arr[i]+" ");
			}
			return;
		}
		// swap
		int temp = arr[p];
		arr[p]=arr[q];
		arr[q]=temp;
		reveser(arr, p+1, arr.length-1);
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void reveser(int [] arr, int si, int ei) {
		while(si<ei) {
			int temp = arr[si];
			arr[si]=arr[ei];
			arr[ei]=temp;
			si++;
			ei--;
		}
	}

}
