import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        sortfunc(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sortfunc(String arr[], int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (compareTo(arr[j], arr[j + 1]) > 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }
    public static int compareTo(String s1, String s2) {

        int i = 0;      

        while (i < s1.length() && i < s2.length()) {

            if (s1.charAt(i) > s2.charAt(i)) {

                return 1;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            }
            i++;

        }

        if (s1.length() > s2.length()) {
            return -1;
        } else {
            return 1;
        }

    }
}