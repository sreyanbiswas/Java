The Logic is Simple which says that all you need to count the number of consequtive same characters are present and add each character with its frequency into StringBuilder.

Algo
1.Traverse on the String.
2.If the Character is same as the next one simply increment count.
3.otherwise append the repeated character.
4.also append the count of it is greater than 1.
5.return by converting the corresponding StringBuilder to String.

Code

 public static String compress(String str){
      int cnt = 0;
      StringBuilder sb = new StringBuilder();
      for(int i = 0;i <= str.length() - 1;i++){
          if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
              cnt++;
          }else{
              sb.append(str.charAt(i));
              if(cnt + 1 > 1){
                  sb.append(cnt+1);
              }
              cnt = 0;
          }
      }

      return sb.toString();
  }