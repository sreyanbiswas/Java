import java.util.*;

public class Main {
    static boolean balancedParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else if (c == ')') {
                if (s.empty() || s.peek() != '(') {
                    return false;
                }
                s.pop();
            } else if (c == '}') {
                if (s.empty() || s.peek() != '{') {
                    return false;
                }
                s.pop();
            } else if (c == ']') {
                if (s.empty() || s.peek() != '[') {
                    return false;
                }
                s.pop();
            }
        }
        return s.empty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ans = balancedParenthesis(str);
        if (ans)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}