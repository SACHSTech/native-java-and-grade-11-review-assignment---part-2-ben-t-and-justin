package gr11review.part2;
import java.io.*;

public class Utility {
   public static String zipZap(String str) {

     int strlength = str.length();
     String newString = "";

     for (int count = 0; count < strlength - 1; count++) {

       if(str.substring(count,count+ 1).equalsIgnoreCase("z") && str.substring(count + 2,count + 3).equalsIgnoreCase("p")){
         newString += str.substring(count,count+ 1);
         newString += str.substring(count+ 2,count+ 3);
         count += 2;
       }else{
         newString += str.substring(count,count+ 1); 
       } 
     }
     return newString; 
   }
  
  public static String longestWord(String filenametxt)throws IOException{
    BufferedReader file = new BufferedReader(new FileReader(filenametxt));

      String word = "";
      String longestword = "";
      boolean firstword = true;

    while((word = file.readLine())!=null){
      if (firstword){
         longestword = file.readLine();
         firstword = false;
      }else if (longestword.length() < word.length()) {
         longestword = word;
      }
    }
    file.close();
    return longestword;
  }

  public static int[] tenRun(int[] nums){

      int count;
      int currentnum = 0;
      int multiple;

      for(count = 0; count < nums.length; count++){
          currentnum = nums[count];
          if(currentnum%10==0){
              multiple = currentnum;
            
          }
      }   
      return nums;

 
  }
}
  
