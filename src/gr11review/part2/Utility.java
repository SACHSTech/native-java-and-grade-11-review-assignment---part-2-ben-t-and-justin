package gr11review.part2;
import java.io.*;
//Create a method that prints a word 
//if a word has a "z" and a "p" then delete the letter imbetween it
//if a word doesn't have 
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
      int multiple = nums[0];

      for(count = 0; count < nums.length; count++){
          currentnum = nums[count];
          if(currentnum%10==0){
              multiple = currentnum;
          }else{
              nums[count] = multiple;
          }
      }   
      return nums;
  }

  public static boolean linearIn(int[] outer, int[] inner){
     
      int count;
      int count2;
      int previousnum = 923;
      int counter = 0;
      int innerlength = inner.length;

      for(count = 0;count < outer.length;count++){
          if(count != 0){
            previousnum = outer[count - 1];
          }
         for(count2 = 0;count2 < innerlength;count2++){
            if((outer[count] == inner[count2]) && (outer[count] != previousnum)){
                counter++;
            }
          }
        }
        if(counter == innerlength){
           return true; 
        }else{
           return false;
        }
    }

  public static void pascalTri(int i, int j)throws IOException{
        
        int[][] p;
        p = new int[i][j];
        PrintWriter fileWriter = new PrintWriter(new FileWriter("src/gr11review/part2/pascalOut.txt", false)); 

        int count1;
        int count2;
        int total;
        int row;
        int column;

        for (count1 = 0; count1 < i; count1++){
          p[count1][0] = 1;
            
        }
        for (count1 = 0; count1 < j; count1++){
          p[0][count1] = 1;
            
        }
        for (count1 = 1; count1 < i - 1; count1++){
            for (count2 = 1; count2 < j - 1; count2++){
                p[i][j] = p[i-1][j] + p[i][j-1];
                p[i][j] = total;
          }
        }
        for (count1 = 0;count1 < i; count1++) {
          for (count2 = 0;count2 < j; count2++){
              System.out.print(p[count1][count2]+","); 
          }
          System.out.println();
     } 
    }
  }

