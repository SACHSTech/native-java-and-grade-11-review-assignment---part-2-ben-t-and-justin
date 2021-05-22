package gr11review.part2;
import java.io.*;

public class Utility {

/**
* @author Benjamin Teh
*/
  public static int sumNumbers(String str){
    int count;
    int sequenceCount = 0;
    char letterHolder;
    String sequenceHolder = "";
    int finalSum = 0;

    for (count = 0; count < str.length(); count++){
    /**
    * Scan each letter and check if it is a number.
    * If it is a number, add it to a temporary string holder.
    */
      letterHolder = str.charAt(count);
      if (Character.isDigit(letterHolder)){
        sequenceCount++;
        sequenceHolder = sequenceHolder + letterHolder;
        if (count == (str.length() - 1)){
          finalSum = finalSum + Integer.parseInt(sequenceHolder);
        }
      }
      else {
        /**
        * Once a non-number is reached, convert the string into a number and add it to the total, and wipe the string. Use a counter to trigger this.
        * Make sure that the sum will add even if the last character of the string is a number.
        */
        if (sequenceCount > 0){
        finalSum = finalSum + Integer.parseInt(sequenceHolder);
        sequenceHolder = "";
        sequenceCount = 0;
        }
      }
    }
    return finalSum;
  }

/**
* @author Benjamin Teh
*/
  public static String alphaWord(String filenametxt) throws IOException{
    BufferedReader file = new BufferedReader(new FileReader(filenametxt));

    String currentLine = "";
    String alphaWord = file.readLine();
    /**
    * Use compareTo command to compare each current string with the previous string. Output the finally word that has the highest value.
    */
    while (currentLine != null){
      currentLine = file.readLine();

      if (currentLine != null && alphaWord.compareToIgnoreCase(currentLine) > 0){
        alphaWord = currentLine;
      }

    }
    return alphaWord;
  }
    
/** 
* Use loops and if statements to first compare if the number matches the value given, and then if the number behind and in front are different from the value given AND the number given is not at the end. Then, replace the number with the larger of the two.
@author Benjamin Teh
*/
  public static int[] notAlone(int[] nums, int value){
    
    int arrayCount;
    
    for (arrayCount = 1; arrayCount < (nums.length - 1); arrayCount++){
      if (nums[arrayCount] == value && nums[arrayCount] != nums[arrayCount - 1] && nums[arrayCount] != nums[arrayCount + 1]){
        if (nums[arrayCount - 1] >= nums[arrayCount + 1]){
          nums[arrayCount] = nums[arrayCount - 1];
        }
        else{
          nums[arrayCount] = nums[arrayCount + 1];
        }
      }
    }
    return nums;
  }

/**
* @author Benjamin Teh
*/
  public static boolean canBalance(int[] nums){
    int counter;
    int totalSum = 0;
    int balanceSum = 0;
  /**
  * Run a loop to add up the total value of the array.
  */
    for(counter = 0; counter < nums.length; counter++){
      totalSum = totalSum + nums[counter];
    }
  /**
  * Problem with the variables. Aim to check simply check if balanceSum * 2 will equal totalSum at any point.
  */
    for(counter = 0; counter < nums.length; counter++){
      balanceSum = balanceSum + nums[counter];
      if(balanceSum * 2 == totalSum){
        return true;
      }
    }

    return false;

  }

/**
* Goal is to create a grid. 
@author Benjamin Teh
*/
  public static void diagonal(int n)throws IOException{
      PrintWriter diagonal = new PrintWriter(new FileWriter("diagonalOut.txt", true));

      /**
      * Use loops and integers that function both as counters, and the rows/columns.
      */ 

      String grid = "";
      int rowCount;
      int columnCount;

      for (rowCount = 0; rowCount < n; rowCount++) {
        grid = "";
      /**
      * Create a loop to input information row by row, across columns from left to right. Add a 1 when the sum of the row + column = n - 1, since I will start my counters at 0 like always. Everything past n-1 will be a 2, and everything before n-1 will be a 0. Remember to print out the grid every time a row ends.
      */
        for (columnCount = 0; columnCount < n; columnCount++) {
          if (rowCount + columnCount == n - 1) {
            grid = grid + "1";
          } else if (rowCount + columnCount > n - 1) {
            grid = grid + "2";
          } else {
            grid = grid + "0";
          }

          /**
          * Add a comma after the number is put in each time if the column is not the last one
          */
          
          if (columnCount != n - 1) {
            grid = grid + ",";
          }
        }
        diagonal.println(grid);
      }
    
  } 
//}  commented out by Mr. Fabroa
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


