package Activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array  = {10, 10, 10, 54, -11, 10} ;
		int searchNum = 10;
		
		int temp=0;
		
		for (int number:Array) {
			if (number == searchNum) {
				temp = temp+number;
			}
		}
		if (temp == 40) {
			System.out.println("Sum of all 10's is 30 in given array");
		}else {
			System.out.println("Sum of all 10's is not 30 in given array");
		}
	}

}
