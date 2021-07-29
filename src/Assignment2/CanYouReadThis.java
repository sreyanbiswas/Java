import java.util.*;
public class Main {
    public static void main(String args[]) {
		CanYouReadThis();
    }
	public static void CanYouReadThis() {

        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        for(int i = 0;i < str.length();i++) {

            if(i != 0 && Character.isUpperCase(str.charAt(i))) {
                System.out.println();
            }

            System.out.print(str.charAt(i));
        }


    }

}
