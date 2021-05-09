package gr11review.part2;
import java.io.*;


public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    int count;
    int sequenceCount = 0;
    int letterCount = 0;
    char letterHolder;
    String sequenceHolder = "";
    int finalSum = 0;
    String str = keyboard.readLine();

    for(count = 0; count < str.length(); count++){
      letterHolder = str.charAt(count);
      if(Character.isDigit(letterHolder)){
        sequenceCount++;
        sequenceHolder = sequenceHolder + letterHolder;
        if(count == (str.length() - 1)){
          finalSum = finalSum + Integer.parseInt(sequenceHolder);
        }
      }
      else{
        letterCount++;
        if(sequenceCount > 0){
        finalSum = finalSum + Integer.parseInt(sequenceHolder);
        sequenceHolder = "";
        sequenceCount = 0;
        }
      }
    }
    System.out.println(finalSum);
    
  }
}
