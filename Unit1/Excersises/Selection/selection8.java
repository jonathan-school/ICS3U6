/*
 * Selection 8
 * Prints 'hello' x times
 * Jonathan Xu
 * February 14, 2018
*/

import java.util.Scanner;

public class Selection8{
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    System.out.print("How many times should I print \"Hello?\"");
    int number = input.nextInt();
    for (int x = 0; x < number; x++){
      System.out.println("Hello");
    }
    input.close();
  }
}