package gr11review.part2;
import java.io.*;

public class Utility {
   /**
   *takes any word that has the letter 'z' and 'p'
   *program will delete any letter inbetween the letters 'z' and 'p'   
   *if word does not have a 'z' or 'p' in it then it won't do anything
   @author Justin Ho Shue
   */
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
  /**
    *program looks in the list of words in the words.txt file
    *program will take the longest word within that file
    @author Justin Ho Shue
  */
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
  /**
    *Takes a list of numbers from the given array
    *Changes each multiple of 10 to 10 
    *if it encounters another multiple of 10 
    *it will change it to that next multiple of 10 
    @author Justin Ho Shue 
  */
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
  /**
    *The code is given 2 arrays of numbers in increasing order
    *if all of the numbers in inner appear in outer then it will return true
    *if not then will return false
    @author Justin Ho Shue
  */ 
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
  /**
    *use pascal's triangle
    *prints out a part of pascal's triangle depending on the given perameters 
    @author Justin Ho Shue 
  */
  public static void pascalTri(int i, int j)throws IOException{
        
        int[][] p;
        p = new int[i][j];
        PrintWriter fileWriter = new PrintWriter(new FileWriter("src/gr11review/part2/pascalOut.txt", false)); 

        int count1;
        int count2;

        for (count1 = 0; count1 < i; count1++){
          p[count1][0] = 1;
            
        }
        for (count1 = 0; count1 < j; count1++){
          p[0][count1] = 1;
            
        }
        for (count1 = 1; count1 < i; count1++){
            for (count2 = 1; count2 < j; count2++){
                p[count1][count2] = p[count1-1][count2] + p[count1][count2-1];
          }
        }
        for (count1 = 0;count1 < i; count1++) {
          for (count2 = 0;count2 < j; count2++){
            if (count2 == j - 1){
              fileWriter.print(p[count1][count2]); 
            }else{
              fileWriter.print(p[count1][count2]+","); 
            }
          }
          fileWriter.println();
     } 
    fileWriter.close();
    }
  }

