/*
 * Strings3
 * Asks for 2 strings and outputs a number
 * Jonathan Xu
 * February 12, 2018
*/

import java.util.Scanner;

class Strings3 {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first word:");
    String word1 = input.nextLine();
    System.out.print("Enter second word:");
    String word2 = input.nextLine();
    System.out.println(word1.compareTo(word2));
  }
}