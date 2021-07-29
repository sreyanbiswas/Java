import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longestVowel(str));
    }
    public static boolean isVowel(char c)
    {
        return (c == 'a' || c == 'e' || c == 'i'
                 || c == 'o' || c == 'u');
    }
 
    public static int longestVowel(String str)
    {
        int count = 0, res = 0;
        char[] s = str.toCharArray();
         
        for (int i = 0; i < s.length; i++) 
        {
 
            // Increment current count 
            // if s[i] is vowel 
            if (isVowel(s[i])) 
            count++;     
 
            else
            {
                // check previous value 
                // is greater then or not
                res = Math.max(res, count);
 
                count = 0;
            }
        }
         
    return Math.max(res, count);
    }
}