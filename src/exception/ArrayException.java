package exception;

public class ArrayException {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		for(int i =0;i<=5;i++) { //코드가 잘 못 된것은 try문을 쓰지 않는다.
			System.out.println(a[i]);
		}
	}
}
