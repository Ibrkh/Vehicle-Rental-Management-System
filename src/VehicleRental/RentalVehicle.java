package VehicleRental;

public class RentalVehicle 
{
	String VehicleType;
	String VehicleID;
	String VehicleName;
	String VehicleColor;
	String VehicleStatus;
	
	//The person renting the vehicle
	String RenteeName;
	String RenteeID;
	
	Date IssueDate;
	Date ReturnDate;
	
	RentalVehicle()
	{
		VehicleType = null;
		VehicleID = null;
		VehicleName = null;
		VehicleColor = null;
		VehicleStatus = null;
	}
	
	public void RentVehicle(String RName, String RID, String Type, String VID, String VName, String VColor, String VStatus, Date Issue, Date Return)
	{
		VehicleType = Type;
		VehicleID = VID;
		VehicleName = VName;
		VehicleColor = VColor;
		VehicleStatus = VStatus;
		
		RenteeName = RName;
		RenteeID = RID;
		
		IssueDate = Issue;
		ReturnDate = Return;
		
	}
	
	public void DriveVehicle()
	{
		
	}
}
