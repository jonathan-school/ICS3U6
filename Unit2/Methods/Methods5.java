/**
 * Methods5
 * Determines the factorial of a number
 * Jonathan Xu
 * March 1, 2018
*/

import java.util.Scanner;

public class Methods5 {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter an integer:");
    int number = input.nextInt();
    System.out.println("The factorial is " + Methods5.factorial(number));
  }
  /**
   * factorial
   * Takes a number and  outputs a factorial
   * @param An integers
   * @return An int representing the factorial of the number
  */
    
  public static int factorial(int a){
    int total = 1;
    for (int i = 1; i <= a; i++){
      total= total * i;
    }
    return total;
  }
}