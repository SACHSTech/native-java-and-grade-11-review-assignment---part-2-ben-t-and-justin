package gr11review.part2;
import java.io.*;
import java.util.*;

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
* In words.txt there are two words that start with "a".
* Therefore we must run a loop checking the first two letters of each word. Each word that is higher in the order than the one before will be replacing the previous word until the file is done running.
*/
  public static String alphaWord(String filenametxt){
    BufferedReader file = new BufferedReader(new FileReader(filenametxt));

    String firstWord;

  }
    

    
}
