import java.util.*;
public class Main {
    public static void main(String args[]) {
       String str="IDID";
       Stack<Integer> st = new Stack<>();
       String result="";
       for(int i=0;i<=str.length();i++){
           st.push(i+1);
           if(i==str.length() || str.charAt(i)=='I'){
               while(!st.isEmpty()){
                   result += String.valueOf(st.peek());
                   result += " ";
                   st.pop();
               }
           }
       }
       System.out.println(result);
    }
}