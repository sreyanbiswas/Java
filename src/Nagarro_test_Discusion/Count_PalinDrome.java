package Nagarro_test_Discusion;

public class Count_PalinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabb";
		Remove_duplicate(str.substring(1),str.substring(0, 1));

	}

	private static void Remove_duplicate(String Ques, String ans) {
		// TODO Auto-generated method stub
		if(Ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char last_ans=ans.charAt(ans.length()-1);
		char first_Ques=Ques.charAt(0);
		if(last_ans==first_Ques) {
			Remove_duplicate(Ques.substring(1), ans);
		}
		else {
			Remove_duplicate(Ques.substring(1), ans+first_Ques);
		}
		
	}

}
