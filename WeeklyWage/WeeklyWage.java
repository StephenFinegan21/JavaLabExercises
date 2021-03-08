package WeeklyWage;
public class WeeklyWage{

	//data members
	private int daysWorked;
	private double dailyRate;
	private double totalPay;


	//constructor
	public WeeklyWage(){
		daysWorked=0;
		dailyRate=0.0;
		totalPay=0.0;

	}//error - illegal start of expression

	//setters - 1 one for every input that you have in your app class
	//return in the number of days from the app class
	public void setDays(int daysWorked){
		//copy the days from the app class into this variable called days
		this.daysWorked= daysWorked;
	}

	public void setMoney(double dailyRate){
		this.dailyRate = dailyRate;
	}


	//compute
	public void compute(){
		totalPay=dailyRate*daysWorked;
	}

	//getters
	//grabbing the totalpay from above
	public double getTotalPay(){
		//returning the total pay to the app class
		return totalPay;
	}







}//error - reached end while parsing