import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int t1=1;t1<=t;t1++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int nor = sc.nextInt();
			int noc = sc.nextInt();
			int freqr[] = new int[nor];
			int freqc[] = new int[noc];
			for(int i=0;i<freqr.length;i++){
				freqr[i] = sc.nextInt();
			}
			for(int i=0;i<freqc.length;i++){
				freqc[i] = sc.nextInt();
			}
			System.out.println(minamount(a,b,c,d,freqr,freqc)); 
		}
    }
	public static int minamount(int a,int b,int c,int d,int freqr[],int freqc[]){
		int rfare = minvehicle(a,b,c,freqr);
		int cfare = minvehicle(a,b,c,freqc);
		return Math.min((rfare+cfare),d);
	}
	public static int minvehicle(int a,int b,int c,int freq[]){
		int sum=0;
		for(int i=0;i<freq.length;i++){
			sum += Math.min(freq[i]*a,b);
		}
		return Math.min(sum,c);
	}
}