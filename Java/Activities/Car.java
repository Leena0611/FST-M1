package Activities;
public class Car {
	public String color;
	public String transmission;
	public int make;
	public int tyres;
	public int doors;
	
	
	public Car() {
		this.tyres = 4;
		this.doors = 4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Color of car is "+color);
		System.out.println("transmission of car is "+transmission);
		System.out.println("make of car is "+make);
		System.out.println("tyres of car is "+tyres);
		System.out.println("doors of car is "+doors);
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car stopped.");
	}

	
}
