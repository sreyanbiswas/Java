import java.util.*;
public class Main {
	public static int count=0;
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		subseq(str,"");
		System.out.println();
		System.out.print(count);
    }
	public static void subseq(String str,String ans){
		if(str.length()==0){
			System.out.print(ans+" ");
			count++;
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		subseq(ros,ans);
		subseq(ros,ans+ch);
	}
}