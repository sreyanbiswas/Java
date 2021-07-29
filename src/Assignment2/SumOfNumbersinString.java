import java.util.*;
public class Main {
    public static void main (String args[]) {
       Scanner scan = new Scanner(System.in);
       int t = scan.nextInt();
       while(t>0){
    String str = scan.next();
    System.out.println(findSum(str));
    t--;
       }
    }
    public static long findSum(String str) 
    { 
        // A temporary string 
        String temp = "0"; 
  
        // holds sum of all numbers present in the string 
        long sum = 0; 
  
        // read each character in input string 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
  
            // if current character is a digit 
            if (Character.isDigit(ch)) 
                temp += ch; 
  
            // if current character is an alphabet 
            else { 
                // increment sum by number found earlier 
                // (if any) 
                sum += Long.parseLong(temp); 
  
                // reset temporary string to empty 
                temp = "0"; 
            } 
        } 
  
        // atoi(temp.c_str()) takes care of trailing 
        // numbers 
        return sum + Long.parseLong(temp); 
    } 
}