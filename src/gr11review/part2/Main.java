package gr11review.part2;

import java.io.*;
import gr11review.part2.Utility.*;
import java.util.Arrays;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //Utility utility = new Utility();
    System.out.println(Utility.zipZap("zipXzap"));

      String words = "src/gr11review/part2/words.txt";

    System.out.println(Utility.longestWord(words)); 

      int[] nums = {2, 10, 3, 4, 20, 5};
    System.out.println(Arrays.toString(Utility.tenRun(nums)));

    int[] nums1 = {1, 2, 4, 6};
    int[] nums2 = {2, 4};
    System.out.println(Utility.linearIn(nums1,nums2));
  }
 
}