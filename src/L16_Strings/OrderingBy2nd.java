import java.util.*;
public class Main {
    public static void main(String args[]) {
        char[] pat = "bca".toCharArray();
        char[] str = "abc".toCharArray();
        sortByPattern(str, pat);
        System.out.println(String.valueOf(str));
    }
    public static void sortByPattern(char str[],char pat[]){
        int count[] = new int[26];
        for(int i=0;i<str.length;i++){
            count[str[i]-'a']++;
        }
        int index=0;
        for(int i=0;i<pat.length;i++){
            for(int j=0;j<count[pat[i]-'a'];j++){
                str[index++] = pat[i];
            }
        }
    }
}