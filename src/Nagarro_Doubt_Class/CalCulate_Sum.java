package Nagarro_Doubt_Class;

import java.util.Arrays;
import java.util.Scanner;

public class CalCulate_Sum {
    static int mod=1_000_000_007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			int q = sc.nextInt();
			while(q-- >0) {
				int x = sc.nextInt();
				if(x==0) {
					for (int i = 0; i < arr.length; i++) {
						arr[i]=2*arr[i];
					}
				}
				else {
				int [] temp =new int [arr.length];
				temp[x]=arr[x]+arr[0];
				int j = x-1;
				while(j!=x) {
					int idx = j-x;
					if(idx<0) {
						idx=idx+n;
					}
				//	System.out.println(idx);
					temp[j]=arr[j]+arr[idx];
					j--;
					 if(j<0) {
						 j=arr.length-1;
					 }
				}
				
				arr=temp;
				}
				//System.out.println(Arrays.toString(arr));
			
			
		}
	long sum=0;
	for (int i = 0; i < arr.length; i++) {
		sum=(sum+arr[i])%mod;
	}
	System.out.println(sum);
	}

	

}
