import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countPalindromicSS(str));
    }
     public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;

        }

        return true;

    }

    public static int countPalindromicSS(String str) {

        int count = 0;

        for (int si = 0; si < str.length(); si++) {

            for (int ei = si + 1; ei <= str.length(); ei++) {

                String ss = str.substring(si, ei);
                if (isPalindrome(ss))
                    count++;
            }
        }

        return count;
    }
}