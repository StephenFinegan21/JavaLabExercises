
/*You have been asked to develop a Guessing Game application that allows the user to compete with the computer to guess a secret number.   The application should generate a random number between 1 and 10 and then ask the user to enter one single number between 1 and 10 to guess what the secret number is.   The application should compare the users guess with the secret number and return one of the following messages:
Correct Guess – “Congratulations, you guessed correctly!”
Higher than the secret number – “You guessed too high, sorry!”
Lower than the secret number – “you guessed to low, sorry!”
When you finish your application, go back to test your application.The application should also tell the user what the secret number was.
Hint 1: The guess and secret number should be compared in the compute method and the message should be returned from the instantiable class to the app class
Hint 2: The Math class contains a method for generating Random numbers
Your application should be developed using instantiable classes and should make use of the JOptionPane class for input and output.
Save your instantiable class as Guess.java*/

package GuessingGame;
import java.util.Random;


public class Guess {
    private int randomNumber;
    private int userGuess;
    String message = " ";

    //Constructor
    public Guess(){
        int randomNumber = 0;
        int userGuess = 0;
    }

    //Methos to create the random numnber and return it
    public int generateRandomNum(){
         randomNumber = (int)(Math.random() * 10 + 1);
         return randomNumber;
    }

    //Us if stats to calculate if user is correct/too high/too low and store the result in message var
    public void compareGuess(int userGuess, int randomNumber){
        if(randomNumber == userGuess){
            message = "Congratulations, you guessed correctly!";
        }
        else if(randomNumber < userGuess){
            message = "You guessed too high, sorry!";
        }
        else if(randomNumber > userGuess){
            message = "you guessed to low, sorry!";
        }
        else{
            message = "Sorry didn't catch that guess, please try again!";
        }
        
    }


    //Return the result
    public String getMessage(){
        return message;
    }

}
