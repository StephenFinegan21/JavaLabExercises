package EggCalculator;

public class eggCalculator {

    //Declare Variables
    public int numberOfEggs; //amount of eggs to be collected
    private int numberOfBoxes; //amount of boxes we will need
    private int BOXCAPACITY;  //capacity is always 12 eggs
    private int leftOverEggs;

    //Make a constructor for our class
    public eggCalculator(){
        numberOfEggs = 0;
        numberOfBoxes = 0;
        BOXCAPACITY = 12;
    }

    // Setter for setting the number of eggs collected - this will be done through user input
    public void setNumberOfEggs(int numberOfEggs){
        this.numberOfEggs = numberOfEggs;
    }


    //Calculate both number of boxes and how many eggs will be left over
    public void calculate(){
        //Divide number of eggs by capacity of each box, will give us a double so we round this up to the nearest int.
        numberOfBoxes = (int) Math.ceil(numberOfEggs / BOXCAPACITY); //Cast as an int because Math.ceil returns double
        leftOverEggs = numberOfEggs % BOXCAPACITY;
    }

    //Get our leftover eggs
    public int getLeftOverEggs(){
        return leftOverEggs;
    }

    //Get the number of boxes needed
    public int getNumberOfBoxes(){
        return numberOfBoxes;
    }


}
