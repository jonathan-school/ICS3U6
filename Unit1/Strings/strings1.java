/*
 * Strings1
 * Asks for sentence and outputs number of characters it contains
 * Jonathan Xu
 * February 12, 2018
*/

import java.util.Scanner;

class Strings1 {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter word:");
    String sentence = input.nextLine();
    System.out.println("There are " + sentence.length() + " characters in the string.");
  }
}