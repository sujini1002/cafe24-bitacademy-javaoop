package exception;

public class MyClass {
	public void dangerMethod() throws MyException{
		System.out.println("Normal State1");
		
		boolean isDanger = true;
		if(isDanger) {
			//예외사항 발생
			throw new MyException();
		}
		System.out.println("Normal State2");
	}
}
