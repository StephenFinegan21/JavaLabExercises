

/*
You have borrowed a sum of money from your sister/brother and they have agreed to give you the money only on the condition that
you must pay it back with interest.  You agree to pay 5% interest per month (or part of a month) that goes by without paying back the money.

Follow the steps below to develop an application that allows you to enter a whole number of months and the amount of money borrowed.
The application should then calculate and output the interest owed and the total amount to be repaid.  Save the file as InterestCalculator.java  Use JOptionPane in your solution.

Step 1: Plan your solution using an IPO chart to identify the names and data types for all of the necessary variables and then answer questions 1 to 5 below.

Step 2: Develop the application using TextPad and then answer questions 6 to 8 below by copying and pasting lines of code from your application.

Step 3: Answer questions 9 and 10 below to test your finished application. */

package InterestCalculator;
import javax.swing.*;

public class InterestCalculator {


    public static void main(String args[]) {

        //Declare Variables
        final double INTEREST = 0.05;
        int months = 0;
        double moneyBorrowed;
        double interestOwed;
        double totalRepayable = 0;

        //Get input of money borrowed and term
        moneyBorrowed = Double.parseDouble(JOptionPane.showInputDialog(null, "How much did you borrow"));
        months = Integer.parseInt(JOptionPane.showInputDialog(null, "Over how many months?"));

        //Calculate the total interest owed
        interestOwed = (INTEREST * moneyBorrowed) * months;

        // Add the interest to the original amount
        totalRepayable = moneyBorrowed + interestOwed;

        //Print out the calculations
        System.out.println(moneyBorrowed + " borrowed over " + months + " months. ");
        System.out.println("You must pay " + interestOwed + " in interest." + " and " + totalRepayable + " in total" );


    }


}

