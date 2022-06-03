package Activities;

public class CustomException extends Exception {
	private String message;
	

	public  CustomException(String m1) {
		this.message = m1;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
