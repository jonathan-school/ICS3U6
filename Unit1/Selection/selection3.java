/*
 * Selection 3
 * Determines temperature state
 * Jonathan Xu
 * February 14, 2018
*/

import java.util.Scanner;

public class Selection3{
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter temperature:");
    int temp = input.nextInt();
    if (temp > 30){
      System.out.println("hot");
    }
    else if (temp >= 20){
      System.out.println("comfortable");
    }
    else if (temp >= 10){
      System.out.println("cool");
    }
    else{
      System.out.println("cold");
    }
    input.close();
  }
}