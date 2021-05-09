package gr11review.part2;
import java.io.*;



public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(Utility.alphaWord("src/gr11review/part2/words.txt"));
    
  }
}
