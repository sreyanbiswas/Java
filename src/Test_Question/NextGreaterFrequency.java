import java.util.*;
public class Main {
    public static void main(String args[]) {
        int a[] = { 1, 1, 2, 3, 4, 2, 1 };
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        int freq[] = new int[max+1];
        for(int i=0;i<a.length;i++){
            freq[a[i]]++;
        }
        NGF(a,freq);
    }
    public static void NGF(int a[],int freq[]){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int ans[] = new int[a.length];
        for(int i=1;i<a.length;i++){
            if(freq[a[i]]<freq[a[s.peek()]]){
                s.push(i);
            }else{
                while(!s.isEmpty() && freq[a[i]]>freq[a[s.peek()]]){
                    ans[s.peek()] = a[i];
                    s.pop();
                }
                s.push(i);
            }
        }
        while(!s.isEmpty()){
            ans[s.peek()] = -1;
            s.pop();
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}