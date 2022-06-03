package Activities;

public class MountainBike extends Bicycle{
	public int seatHeight;
	
	public MountainBike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		// TODO Auto-generated constructor stub
		this.seatHeight = seatHeight;
	}
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	@Override
	public String bicycleDesc() {
		return("No of gears are "+ super.gears + "\nSpeed of bicycle is " + currentSpeed + " \nSeatHeight: "+seatHeight);
	}
}
