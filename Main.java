
import java.util.Scanner;
/**
 * Lets the user know if they can drive or not
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //Define the minimum arguments
    final int MIN_DRIVER_AGE = 16;

    //define minimun voting age
    final int VOTING_AGE = 18;

    // promt the user for their age 
    System.out.println("Please enter your age:");
    int age = input.nextInt();

    //check to see if they can vote and drive
    if(age >= VOTING_AGE){
      System.out.println("You can vote");
      System.out.println("You can legally drive");
    } else if(age >= MIN_DRIVER_AGE){
     //tell them if they can drive
     System.out.println("You can legally get your license");
    } else {
      //If not old enough to drive or vote
      System.out.println("Sorry, you can't drive or vote yet!");
    }


    //boolean logical operators
    //between 18 and 30
    if(age >= 18 && age <= 30){
      //age is equal to 18 and
      // age is less than or equal to 30
      System.out.println("Its time to go to college");
    }

    if(age < 18 || age > 60){
      
    }

  }
}
