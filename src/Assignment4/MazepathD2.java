import java.util.*;
public class Main {
	public static int count=0;
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		mazepath(0,0,n-1,n-1,"");
		System.out.println();
		System.out.println(count);
    }
	public static void mazepath(int cr,int cc,int er,int ec,String ans){
		if(cr==er && cc==ec){
			System.out.print(ans+" ");
			count++;
			return;
		}

		if(cr>er || cc>ec){
			return;
		}

		mazepath(cr+1,cc,er,ec,ans+"V");
		mazepath(cr,cc+1,er,ec,ans+"H");
		if(cc==cr || (cc+cr)==er){
			mazepath(cr+1,cc+1,er,ec,ans+"D");
		}
	}
}