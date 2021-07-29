import java.util.*;
public class Main {
	public static int count=0;
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		subset_prblm(arr,0,0,"",t);
		System.out.println();
		System.out.println(count);
    }
	public static void subset_prblm(int[] arr, int vidx,int ssf,String ans,int target){
      //Base Case
      if(vidx == arr.length){
             //Positive Base Case
          if(target == ssf){
              System.out.print(ans+" ");
			  count++;
              return;
          }
             //Negative Base Case
          return;
      }

    
       //If the element is included in the answer
      subset_prblm(arr,vidx + 1,ssf + arr[vidx],ans + arr[vidx]+" ",target);

      //If the element is not included in the answer
      subset_prblm(arr,vidx + 1,ssf,ans,target);
  }
}