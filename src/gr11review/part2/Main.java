package gr11review.part2;

import java.io.*;
import gr11review.part2.Utility.*;

public class Main { 
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    Utility utility = new Utility();
    System.out.println(utility.zipZap("zipXzap"));

    System.out.println(utility.longestWord("src/grllreview/part2/words.txt")); 

  }
 
}