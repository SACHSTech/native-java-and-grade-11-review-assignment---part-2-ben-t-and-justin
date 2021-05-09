package gr11review.part2;
import java.io.*;
import java.util.Arrays;



public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    int[] nums = {2, 1, 3, 4};
    int value = 2;
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(Utility.notAlone(nums, value)));
    
  }
}
