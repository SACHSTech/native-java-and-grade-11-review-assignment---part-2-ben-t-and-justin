package gr11review.part2;
import java.io.*;



public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    String str = keyboard.readLine();

    System.out.println(Utility.sumNumbers(str));
    
  }
}
