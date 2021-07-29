import java.util.*;

public class Main{
    static int[] a = new int[1000000];
    static int[] r = new int[1000000];
    static int[] l = new int[1000000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        l[0] = a[0];
        r[n - 1] = a[n - 1];
        int leftmax = 0, rightmax = 0;
        for (int i = 1; i < n; i++) {
            l[i] = Math.max(l[i - 1], a[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            r[i] = Math.max(r[i + 1], a[i]);
        }
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += (Math.min(l[i], r[i]) - a[i]);
        }
        System.out.println(water);
        t--;
    }
    }
}