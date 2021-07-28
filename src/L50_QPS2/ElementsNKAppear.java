import java.util.*;
public class Main {
    public static void main(String args[]) {
       int arr[] = { 4, 5, 6, 7, 8, 4, 4 };
       int k = 3;
       int n = arr.length;
       int t = n/k;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
           int nf = map.getOrDefault(arr[i],0)+1;
           map.put(arr[i],nf);
       }
       for(int key:map.keySet()){
           int val = map.get(key);
           if(val>t){
               System.out.println(key);
           }
       }
    }
}