package VehicleRental;

public class Date
{
	// Attributes
	int Day;
	int Month;
	int Year;
	
	// Default Constructor
	Date()
	{
		Day = -1;
		Month = -1;
		Year = -1;
	}
	
	//Parameterized Constructor
	Date(int day,int month, int year)
	{
		this.Day = day;
		this.Month = month;
		this.Year = year;
	}

	void DisplayDate()
	{
		System.out.println("Date: " + Day + "/" + Month + "/" + Year);
	}
}

