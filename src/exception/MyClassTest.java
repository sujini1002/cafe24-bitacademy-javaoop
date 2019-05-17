package exception;

public class MyClassTest {
	public static void main(String[] args) {
		try {
			MyClass myCalss= new MyClass();
			myCalss.dangerMethod();//dangerMethod()메소드가 오류를 던지기 때문에
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
