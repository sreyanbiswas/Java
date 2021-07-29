import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(diff_ascii(str));
    }
	public static String diff_ascii(String str){

      String ans = "";

      for(int i = 0;i < str.length() - 1;i++){

          ans += str.charAt(i);
          int diff = str.charAt(i + 1) - str.charAt(i);
          ans += diff;
          // ans += str.charAt(i + 1);
      }

      ans += str.charAt(str.length() - 1);

      return ans;
  }

}