package EggCalculator;
import java.util.*;

public class eggCalculatorApp {

    public static void main(String args[]){
        //Declare variables
        int numberOfEggs;

        //Set up scanner for user input
        Scanner keyboard = new Scanner(System.in);

        //Prompt user of how many eggs they have
        System.out.println("How many eggs have you collected today?");
        //set the number of eggs to the user input
        numberOfEggs = keyboard.nextInt();

        //make the eggCalculatoir object and set the number of eggs user has collected
        eggCalculator myEggs = new eggCalculator();
        myEggs.setNumberOfEggs(numberOfEggs);

        //Do the calculation and print
        myEggs.calculate();
        System.out.println("You will need " + myEggs.getNumberOfBoxes() + " boxes altogether");
        System.out.println("You will have " + myEggs.getLeftOverEggs() +  " eggs left over");
        keyboard.close();
    }
}
