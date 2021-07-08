package Nagarro_test_Discusion;

public class Min_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
          System.out.println(min_subString_window(s, t));
	}

	public static String min_subString_window(String s, String t) {
		int[] freq_s = new int[256];
		int[] freq_t = new int[256];
		for (char c : t.toCharArray()) {
			freq_t[c]++;
		}
		int count = 0;
		int start = 0;
		int min_lenght=Integer.MAX_VALUE;
		int start_Index=-1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq_s[ch]++;
			if (freq_s[ch] <= freq_t[ch]) {
				count++;
			}
			if (count == t.length()) {
				while (freq_s[s.charAt(start)] > freq_t[s.charAt(start)] || freq_t[s.charAt(start)] == 0) {
					if (freq_s[s.charAt(start)] > freq_t[s.charAt(start)]) {
						freq_s[s.charAt(start)]--;
					}
					start++;
				}
				if(min_lenght> i-start+1) {
					min_lenght=i-start+1;
					start_Index=start;
				}

			}
			

		}
		if(start_Index==-1) {
			return "";
		}
		return s.substring(start_Index, start_Index+min_lenght);
		

	}

}
