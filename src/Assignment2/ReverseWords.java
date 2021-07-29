import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int t1=0;t1<=t;t1++){
            String str = sc.nextLine();
            String words[] = str.split(" ");
            String s="";
            for(int i=words.length-1;i>=0;i--){
                if(i!=0){
                s = s+words[i]+" ";
                }else{
                    s = s+words[i];
                }
            }
            System.out.println(s);
        }
    }
}