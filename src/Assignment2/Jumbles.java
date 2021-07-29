import java.util.*;
class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String s1 = sc.next();
       String s2 = sc.next();
       char a1[] = s1.toCharArray();
       char a2[] = s2.toCharArray();
       Arrays.sort(a1);
       Arrays.sort(a2);
       String str1 = String.valueOf(a1);
       String str2 = String.valueOf(a2);
       if(str1.equals(str2)){
           System.out.println("True");
       }else{
           System.out.println("False");
       }
    }
}