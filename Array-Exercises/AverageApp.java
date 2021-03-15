import javax.swing.*;

public class AverageApp {
public static void main(String[] args) {
    
    int[] arr;
    arr = new int[5];
    int avg = 0;
    int max;
    int min;

    for (int i = 0; i<5; i++){
        arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter 5 digits"));
    }//Loop will stop at index 4 which is the 5th character

    //Declare the instantiable class and name it myArray
    Avg myArray = new Avg();
    myArray.setArray(arr); //Passes in the user input to the instantiable class setter
    myArray.compute(); //Works out the average
    avg = myArray.getAvg(); //Getter stores the  avg value in the avg variable

    MaxNum maxNum = new MaxNum();
    maxNum.setArray(arr);
    maxNum.computeMax();
    max = maxNum.getMax();

    MinNum minNum = new MinNum();
    minNum.setArray(arr);
    minNum.computeMin();
    min = minNum.getMin();

    System.out.println("Max is " + max);
    System.out.println("Min is " + min);
    System.out.println("Avg is " + avg);
    

    


    }
}
