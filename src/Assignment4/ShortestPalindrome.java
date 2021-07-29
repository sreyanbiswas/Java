import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(shortestPalindrome(s));

    }

     public static  String shortestPalindrome(String s) {
            String r = new StringBuilder(s).reverse().toString();
            int n = s.length();
            for (int i = 0; i < n; i++) {
                if (r.substring(i).equals(s.substring(0, n-i))) {
                    return r.substring(0, i) + s;
                }
            }
            return "";
        }

}

