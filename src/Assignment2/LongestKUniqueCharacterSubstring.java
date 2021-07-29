The problem can be solved in O(n). Idea is to maintain a window and add elements to the window till it contains less or equal k Unique Character, update our result if required while doing so. If unique elements exceeds than required in window, start removing the elements from left side.

Below are the implementations of above. The implementations assume that the input string alphabet contains only 26 characters (from ‘a’ to ‘z’). The code can be easily extended to 256 characters.

Java Code:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String str = sc.next();
            int k = sc.nextInt();
        System.out.println(kUniques(str, k));
        }


    }
    public static int kUniques(String str, int k) {

        int freq [] = new int [26];
        int start= 0;
        int dis=0;
        int max_len = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i)-'a';
            if(freq[idx]==0) {
                dis++;
            }
            freq[idx]++;
            while(dis>k) {
                int new_idx = str.charAt(start)-'a';
                freq[new_idx]--;
                if(freq[new_idx]==0) {
                    dis--;
                }
                start++;
            }



            max_len= Math.max(max_len, i-start+1);


        }
        if(max_len<k) {
            return -1;
        }
        return max_len;

    }

}