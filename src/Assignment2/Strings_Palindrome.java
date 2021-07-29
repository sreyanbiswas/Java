import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){

      int n = str.length();
      for(int i =0;i< n/2;i++){

          if(str.charAt(i) != str.charAt(n - i - 1)){
              return false;
          }
      }

      return true;
  }


}