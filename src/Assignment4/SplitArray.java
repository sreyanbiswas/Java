ssf1 : It is basically sum so far of 1st split.
ssf2 : It is sum so far of 2nd split.
ans1 : It is declared to keep track of numbers which are a part of 1st split.
ans2 : It is declared to keep track of numbers which are a part of 2nd split.
cnt : Local variable to return the total number of count.
Code

 public static int split_array(int[] arr, int vidx,int ssf1,int ssf2,String ans1, String ans2){
      if(vidx == arr.length){

            //Positive Base Case
          if(ssf1 == ssf2){
              System.out.println(ans1+"and "+ans2);
              return 1;
          }
           //Negative Base Case
          return 0;
      }
      int cnt = 0;
       //If the current element is part of 1st split
      cnt += split_array(arr,vidx + 1,ssf1 + arr[vidx],ssf2,ans1+arr[vidx]+" ",ans2);

        //If the current element is part of 2nd split
      cnt += split_array(arr,vidx + 1,ssf1,ssf2 + arr[vidx],ans1,ans2+arr[vidx]+" ");
      return cnt;
  }