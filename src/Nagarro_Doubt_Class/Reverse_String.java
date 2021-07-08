package Nagarro_Doubt_Class;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			System.out.println(str);
		}

	}
	public static boolean campareTo(String s1, String s2) {
		int i=0;
		while(i<s1.length() && i<s2.length()) {
			if(s1.charAt(i)>s2.charAt(i)) {
				return true;
			}
			if(s1.charAt(i)<s2.charAt(i)) {
				return false;
			}
			
		}
		if(s1.length()<s2.length()) {
			return true;
		}
		else {
			return false;
		}
	}

}
