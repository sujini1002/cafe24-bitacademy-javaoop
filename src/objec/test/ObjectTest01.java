package objec.test;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10,20);
		
		System.out.println(p.getClass()); //reflection - 객체가 어떤 클래스로 저장되어있는지 
		System.out.println(p.hashCode());// reference value는 아님 ->
										// address 도 아님
										// address 기반의 hashing 값
		System.out.println(p);// p.toString()을 호출
		System.out.println(p.toString());//getClass + @ + hashCode()-16진수
	}

}
