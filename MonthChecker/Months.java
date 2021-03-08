package MonthChecker;
public class Months {
    
private int number; // input
private int days; //output


public Months(){
    number = 0;
    days =  0;
}

public void calculateDays(int number){
    if(number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12 ){
        days = 31;
    }

    else if(number == 4 || number == 6 || number == 9 || number == 11){
        days = 30;
    }

    else{
        days = 29;
    }
}

public int getDays() {
    return days;
    
}

}











