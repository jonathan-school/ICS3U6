/*
 * While1
 * Prompts for password and responds
 * Jonathan Xu
 * Feb 15, 2018
*/

import java.util.Scanner;

public class While1{
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a secret password:");
    String password = input.nextLine();
    boolean flag = false;
    String key = "";
    
    while (!flag){
      System.out.print("Enter password:");
      key = input.nextLine();
      if (key.equals(password)){
        System.out.println("Password Accepted.");
        flag = true;
      }
      else{
        System.out.println("Error-incorrect password.");
      }
    }
    
  }
}
