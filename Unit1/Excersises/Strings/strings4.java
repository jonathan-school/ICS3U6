/*
 * Strings4
 * Asks user for a sendence made of five words then outputs each word in the sentence on a new line
 * Jonathan Xu
 * February 12, 2018
*/

import java.util.Scanner;

class Strings4 {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your sentence made of five words:");
    String sentence = input.nextLine();
    for (int x = 0; x<6; x++){
      int space = sentence.indexOf(" ");
      System.out.println(sentence.substring(0,space));
      sentence = sentence.substring(space+1);   
    }
  }
}