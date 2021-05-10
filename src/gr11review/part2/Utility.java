package gr11review.part2;
import java.io.*;

public class Utility {

/**
* Scan each letter and check if it is a number.
* If it is a number, add it to a temporary string holder.
* Once a non-number is reached, convert the string into a number and add it to the total, and wipe the string. Use a counter to trigger this.
* Make sure that the sum will add even if the last character of the string is a number.
@author Benjamin Teh
*/
  public static int sumNumbers(String str){
    int count;
    int sequenceCount = 0;
    char letterHolder;
    String sequenceHolder = "";
    int finalSum = 0;

    for (count = 0; count < str.length(); count++){
      letterHolder = str.charAt(count);
      if (Character.isDigit(letterHolder)){
        sequenceCount++;
        sequenceHolder = sequenceHolder + letterHolder;
        if (count == (str.length() - 1)){
          finalSum = finalSum + Integer.parseInt(sequenceHolder);
        }
      }
      else {
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
* Use compareTo command to compare each current string with the previous string. Output the finally word that has the highest value.
@author Benjamin Teh
*/
  public static String alphaWord(String filenametxt) throws IOException{
    BufferedReader file = new BufferedReader(new FileReader(filenametxt));

    String currentLine = "";
    String alphaWord = file.readLine();

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
* Run a loop to add up the total value of the array.
Divide it in half. Run a loop again and stop when the current sum of the value is greater than or equal to the half sum. If the current sum is equal to the half sum, then it can be split in half. Return true. If it is greater, then return false.
Edit: Problem with the variables. Aim to check simply check if balanceSum * 2 will equal totalSum at any point.
@author Benjamin Teh
*/
  public static boolean canBalance(int[] nums){
    int counter;
    int totalSum = 0;
    int balanceSum = 0;

    for(counter = 0; counter < nums.length; counter++){
      totalSum = totalSum + nums[counter];
    }

    for(counter = 0; counter < nums.length; counter++){
      balanceSum = balanceSum + nums[counter];
      if(balanceSum * 2 == totalSum){
        return true;
      }
    }

    return false;

  }

/**
* Goal is to create a grid. Use loops and integers that function both as counters, and the rows/columns.
* Create a loop to input information row by row, across columns from left to right. Add a 1 when the sum of the row + column = n - 1, since I will start my counters at 0 like always.
*/
  public static void diagonal(int n)throws IOException{
      PrintWriter diagonal = new PrintWriter(new FileWriter("diagonalOut.txt", true));

      String grid = "";
      int rowCount;
      int columnCount;

      for (rowCount = 0; rowCount < n; rowCount++) {
        grid = "";

        for (columnCount = 0; columnCount < n; columnCount++) {
          if (rowCount + columnCount == n - 1) {
            grid = grid + "1";
          } else if (rowCount + columnCount > n - 1) {
            grid = grid + "2";
          } else {
            grid = grid + "0";
          }

          //add comma to number if not at the end
          if (columnCount != n - 1) {
            grid = grid + ",";
          }
        }
        diagonal.println(grid);
      }
    
  } 
}
