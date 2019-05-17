package exception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public MyException() {
		super("MyException Occurs......"); // 에러 메시지를 안받았을 경우
	}
	
	public MyException(String message) {
		super(message); // 에러 메시지를 안받았을 경우
	}
}
