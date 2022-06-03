package Activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car nexon = new Car();
		nexon.color = "Black";
		nexon.transmission= "Automatic";
		nexon.make=2022;
		
		nexon.displayCharacteristics();
		nexon.accelarate();
		nexon.brake();
	}

}
