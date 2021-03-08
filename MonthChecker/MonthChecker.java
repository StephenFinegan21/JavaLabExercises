package MonthChecker;
import java.util.Scanner;

public class MonthChecker {
    public static void main(String args[]){

        int number;
        int days;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What month of the year would you like to check (Enter in a number corresponding to that month eg 1 is Jan, 2 is Feb etc");
        number = keyboard.nextInt();
        

        Months myMonth = new Months();
        myMonth.calculateDays(number);
        days = myMonth.getDays();

        System.out.println("There are " + days + " days in that month");
        keyboard.close();

    }
    
}
