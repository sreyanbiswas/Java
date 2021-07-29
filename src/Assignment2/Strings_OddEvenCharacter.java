import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(changeCase(str));
    }
     public static String changeCase(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ((i + 1) % 2 == 0) {
                sb.append((char)(ch - 1));
            } else{
                sb.append((char)(ch + 1));
            }

        }

        return sb.toString();

    }

}