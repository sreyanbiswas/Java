import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        for(int i=0;i<x;i++){
            l1.add(sc.nextInt());
        }
        for(int i=0;i<y;i++){
            l2.add(sc.nextInt());
        }
        for(int i=0;i<z;i++){
            l3.add(sc.nextInt());
        }
        int t = sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                for(int k=0;k<z;k++){
                    if((l1.get(i)+l2.get(j)+l3.get(k))==t){
                        System.out.print(l1.get(i)+" "+l2.get(j)+" "+l3.get(k));
                        return;
                    }
                }
            }
        }
    }
}