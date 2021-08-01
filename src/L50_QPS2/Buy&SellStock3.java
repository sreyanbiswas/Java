import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
        int profit[] = new int[price.length];
        int max = price[price.length-1];
        for(int i=price.length-2;i>=0;i--){
            if(price[i]>max){
                max = price[i];
            }
            profit[i] = Math.max(profit[i+1],max-price[i]);
        }
        System.out.println(profit[0]);
        int min = price[0];
        for(int i=1;i<price.length;i++){
            if(price[i]<min){
                min = price[i];
            }
            profit[i] = Math.max(profit[i-1],profit[i]+(price[i]-min));
        }
        System.out.println(profit[profit.length-1]);
    }
}