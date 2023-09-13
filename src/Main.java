import javax.swing.*;
import java.util.Scanner;


public class Main {
  public static void main(String[] args){
    JOptionPane.showMessageDialog(null, "Hello there!");
    OptionMenu();

}
  public static void OptionMenu() {
    //option menu, creates popUp
    String userChoice = JOptionPane.showInputDialog(null,
            "Select an option or type \"exit\": \n" + "1: Reverse a string\n" + "2: Find the greatest integer\n" +
            "3: Calculate the factorial of an integer\n" + "4: Get the Nth entry of the fibonacci sequence\n");

  //Reverse String Option
    if (userChoice.equals("1") || userChoice.equalsIgnoreCase("Reverse a string")) {
      String input = JOptionPane.showInputDialog("Enter the string you want to reverse: \n");
      String output = new ReverseString(input).ReverseTheString();
      JOptionPane.showMessageDialog(null, "Your string in Reverse is: " + output);
      //The only way out is to exit from the menu :)
      OptionMenu();
    }
    //Greatest Integer Option
    else if (userChoice.equals("2") || userChoice.equalsIgnoreCase("Find the greatest integer")) {
      System.out.println("Enter three integers: ");

    }
    else if (userChoice.equals("3") || userChoice.equalsIgnoreCase("Calculate the factorial of an integer")) {
      System.out.println("Enter an integer: ");

    }
    else if (userChoice.equals("4") || userChoice.equalsIgnoreCase("Get the Nth entry of the fibonacci sequence")) {
      System.out.println("Enter an integer: ");

    }
    else if (userChoice.equalsIgnoreCase("exit")) {
      JOptionPane.showMessageDialog(null,"See you later!");
      return;
    }
    else {
      System.out.println("Sorry, I don't understand. Please try again.");
      //OptionMenu();
    }

  }
}