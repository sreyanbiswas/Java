import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0) {
      String str = sc.next();
      //int k = sc.nextInt();
    System.out.println(Longest_Even_Length_Substring(str));
    }

  }

  private static int Longest_Even_Length_Substring(String str) {
    // TODO Auto-generated method stub
    int ans = 0;
    for(int i=0; i<str.length(); i++) {
      for (int j = i+1; j < str.length(); j++) {
        int len = j-i+1;
        int p=i; 
        int q=j;
        int left_sum=0;
        int right_sum=0;
        if(len%2==0){
        while(p<q) {
          left_sum+=str.charAt(p)-'0';
          right_sum+=str.charAt(q)-'0';
          p++;
          q--;

        }
        if(left_sum==right_sum && ans<len) {
          ans=len;
        }
        }


      }
    }
    return ans;

  }

}
