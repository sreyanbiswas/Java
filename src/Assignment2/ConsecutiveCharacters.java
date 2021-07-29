import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(maxPower(str));
    }
    public static int maxPower(String s) {
        int count = 0;
        int maxCount = 0;
        char previous = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == previous) {
                // if same as previous one, increase the count
                count++;
            } else {
                // else, reset the count
                count = 1;
                previous = c;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}