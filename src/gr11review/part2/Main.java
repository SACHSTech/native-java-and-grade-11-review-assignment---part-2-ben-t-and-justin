package gr11review.part2;

import java.io.*;
import gr11review.part2.Utility.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //Utility utility = new Utility();
    System.out.println(Utility.zipZap("zipXzap"));

      String words = "src/gr11review/part2/words.txt";

    System.out.println(Utility.longestWord(words)); 

    System.out.println();
  }
 
}