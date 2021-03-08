package GuessingGame;

import javax.swing.*;

public class GuessApp {
    
    public static void main(String args[]){
        //Declare variables to (1)hold the rnadom num, (2)the user guess and the (3)messgae to user
        int randomNumber;
        int userGuess;
        String message = " ";

        //Create the guess game class 
        Guess myGuessGame = new Guess();

        //Get the user guess using joption pane and generate the ran number
        userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Take a guess at a number between 1-10"));
        randomNumber = myGuessGame.generateRandomNum();
        
        //Compute
         myGuessGame.compareGuess(userGuess, randomNumber);
        
        //Retrieve the string result of the calculation
        message = myGuessGame.getMessage();

        //Print out the results to the user
        System.out.println("The random number was " + randomNumber);
        System.out.println("Your guess was " + userGuess);
        System.out.println(message);

    }
}
