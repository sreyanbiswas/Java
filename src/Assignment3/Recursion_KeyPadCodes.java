import java.util.*;
public class Main {
    static int count=0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        allCodes(str,"");
        System.out.println();
        System.out.println(count);
    }
    public static String codes(char ch){
        if(ch=='1'){
            return "abc";
        }
        if(ch=='2'){
            return "def";
        }
        if(ch=='3'){
            return "ghi";
        }
        if(ch=='4'){
            return "jkl";
        }
        if(ch=='5'){
            return "mno";
        }
        if(ch=='6'){
            return "pqrs";
        }
        if(ch=='7'){
            return "tuv";
        }
        if(ch=='8'){
            return "wx";
        }
        if(ch=='9'){
            return "yz";
        }
        return "";
    }
    public static void allCodes(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        String code = codes(ch);
        for(int i=0;i<code.length();i++){
            allCodes(ros,ans+code.charAt(i));
        }
    }
}