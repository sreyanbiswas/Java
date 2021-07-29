import java.util.*;
public class Main {
    public static void main (String args[]) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=1;i<=n1;i++){
            int n = sc.nextInt();
            list1.add(n);
            s1.push(n);
        }
        for(int i=1;i<=n2;i++){
            int n = sc.nextInt();
            list2.add(n2);
            s2.push(n);
        }
        int sum=0;
        int carry=0;
        int a=0,b=0,total=0;;
        while(!s1.isEmpty() || !s2.isEmpty()){
            if(!s1.isEmpty()){
                a = s1.pop();
            }
            if(!s2.isEmpty()){
                b = s2.pop();
            }
            total = carry+a+b;
            res.addFirst(total%10);
            carry = total/10;
            a=0;
            b=0;
        }
        if(carry!=0){
            res.addFirst(carry);
        }
        while(!res.isEmpty()){
            System.out.print(res.removeFirst()+" ");
        }
    }
}