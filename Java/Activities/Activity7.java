package Activities;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(8,21,10);
		mb.speedUp(5);
		System.out.println(mb.bicycleDesc());
		mb.Changegears(3);
		mb.setHeight(15);
		mb.applyBrake(2);
		System.out.println(mb.bicycleDesc());
		
		Bicycle b = new Bicycle(4, 6);{
			System.out.println(b.bicycleDesc());
		}
		
		}
	

}
