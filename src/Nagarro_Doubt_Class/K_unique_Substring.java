package Nagarro_Doubt_Class;

import java.util.Scanner;

public class K_unique_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			int k = sc.nextInt();
		System.out.println(Flip_char(str, k));
		}
	}

	public static int Flip_char(String str, int k) {
		// TODO Auto-generated method stub
		int ans = 0;
		int i = 0;
		int j = 0;
		int dis=0;
		int freq[] = new int [26];
		while(j<str.length()) {
		char ch = str.charAt(j);
			if(freq[ch-97]==0) {
				dis++;
			}
			freq[ch-97]++;
			
			while(dis>k) {
				ch = str.charAt(i);
				freq[ch-97]--;
				if(freq[ch-97]==0) {
					dis--;
				}
				i++;
			}
			ans = Math.max(ans, j-i+1);
			j++;
		}
		return ans;
	}

}
