package gr11review.part2;
import java.io.*;
import java.util.Arrays;



public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    int[] nums = {2, 3, 4, 2};
    System.out.println(Utility.canBalance(nums));
    
  }
}
