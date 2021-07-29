import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(int i=n1;i<=n2;i++){
			if(isArmstrong(i)){
				System.out.println(i);
			}
		}
    }
public static boolean isArmstrong(int num){

        int sum=0;
		int nod = numberOfDigits(num);
        int temp=num;

        while(num!=0){

            int rem=num%10;

            int p=1;
            for(int i=1;i<=nod;i++)
                p=p*rem;
            sum+=p;

            num/=10;
        }
        if(sum==temp)
            return true;
        else
            return false;
}

public static int numberOfDigits(int num){

        int count=0;
        while(num!=0){
          num=num/10;
          count++;

        }
        return count;
}

}