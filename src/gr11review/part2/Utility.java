package gr11review.part2;
import java.io.*;

public class Utility {
   public static String zipZap(String str) {

     int strlength = str.length();
     String newString = "";

     for (int count = 0; count < strlength - 1; count++) {

       if(str.substring(count,count+ 1).equalsIgnoreCase("z") && str.substring(count + 2,count + 3).equalsIgnoreCase("p")){
         newString += str.substring(count,count+ 1);
         newString += str.substring(count+ 2,count+ 3);
         count += 2;
       }else{
         newString += str.substring(count,count+ 1); 
       } 
     }
     return newString; 
   }
  }
  
