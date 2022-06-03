package Activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane = new Plane(10);
		plane.onBoard("leena");
		plane.onBoard("Sunil");
		plane.onBoard("Avkash");
		
		System.out.println(plane.takeOff());
		System.out.println(plane.getPassesngers());
		Thread.sleep(10000);
		plane.land();
		System.out.println(plane.getLastTimeLanded());
		System.out.println(plane.getPassesngers());
	}

}
