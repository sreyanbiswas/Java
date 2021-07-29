import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        int[] temp = arr.clone();

        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        int ops = sc.nextInt();

        while(ops>0)
        {
            int x = sc.nextInt();

            for(int i=0;i<size;i++)
            {
                if(i-x<0)
                {
                    temp[i] = arr[i];
                    arr[i] = arr[i]+arr[size+(i-x)];
                }
                else
                {
                     temp[i] = arr[i];
                     arr[i] = arr[i]+temp[i-x];
                }
               
            }
            ops--;
        }

        int sum = 0;

      

        for(int i:arr)
        {
            sum+=i;
        }

        int val = (int)Math.pow(10,9)+7;

        System.out.print(sum%val);

    }
}