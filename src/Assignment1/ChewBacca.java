import java.util.*;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
       System.out.println(smallest_num(n));
    }

  public static long smallest_num(long num){
    long ans = 0;
    long mult = 1;
    while(num != 0){
      long rem = num % 10;
      if(rem >= 5){
        if(rem == 9 && (num/10) == 0){
        }else{
          rem = 9 - rem;
        }
      }
      ans += rem * mult;
      mult *= 10;
      num /= 10;
    }
    return ans;
  }
}