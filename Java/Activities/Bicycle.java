package Activities;

public class Bicycle implements BicycleParts,BicycleOperations {
	public int gears=2;
	public int currentSpeed=9;
	
	public Bicycle(int gears, int currentSpeed) {
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	
	public void Changegears(int gearNum) {
		this.gears = gearNum;
	}
	
	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		//super.currentSpeed = currentSpeed - decrement;
		currentSpeed = currentSpeed-decrement;
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed = currentSpeed+increment;
	}
	
	public String bicycleDesc() {
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
	
}
