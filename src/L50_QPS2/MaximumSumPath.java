import java.util.*;
public class Main {
    public static void main(String args[]) {
        int ar1[] = { 2, 3, 7, 10, 12, 15, 30, 34 };
        int ar2[] = { 1, 5, 7, 8, 10, 15, 16, 19 };
        int i=0;
        int j=0;
        int sum1=0;
        int sum2=0;
        int result=0;
        while(i<ar1.length && j<ar2.length){
            if(ar1[i]<ar2[j]){
                sum1 += ar1[i];
                i++;
            }else if(ar1[i]>ar2[j]){
                sum2 += ar2[j];
                j++;
            }else{
                result += Math.max(sum1,sum2)+ar1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        while(i<ar1.length){
            sum1 += ar1[i++];
        }
        while(j<ar2.length){
            sum2 += ar2[j++];
        }
        result += Math.max(sum1,sum2);
        System.out.println(result);
    }
}