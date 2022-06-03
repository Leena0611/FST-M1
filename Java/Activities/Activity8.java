package Activities;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			exceptionTest("This is string");
			exceptionTest(null);
			exceptionTest("This is string 2346787");
		}
		catch(CustomException m2){
			System.out.println("Exception caught");
		}finally {
			System.out.println("Inside finally block");
		}
		
	}
	
	public static void exceptionTest(String stext) throws CustomException {
		if (stext == null) {
			throw new CustomException("String value is null");
		}else {
			System.out.println(stext);
		}

	}
}
