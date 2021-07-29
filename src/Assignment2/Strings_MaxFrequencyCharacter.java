import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int max=0;
		int arr[] = new int[26];
		for(int i=0;i<str.length();i++){
			arr[str.charAt(i)-'a']++;
		}
		char maxc = 'a';
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
				maxc = (char)(i+'a');
			}
		}
		System.out.println(maxc);
    }
}