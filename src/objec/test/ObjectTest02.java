package objec.test;

public class ObjectTest02 {
	
	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
		
		//== : 두 객체의 동일성(같은의미)
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		//equals : 두 객체의 동질성을 비교한다.(내용비교X) - String은 내용비교로 오버라이딩 한 것
		//Object의 equals() 기본구현  '==' 연산결과와 같다.
		//toString()과 hashCode()를 동시에 오버라이딩한다.
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		//String
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode()+":"+s2.hashCode());//내용기반 hashcode()
		System.out.println(System.identityHashCode(s1)+":"+s1.hashCode());//주소기반 hashcode()
		
		String s3 = "ABC";
		String s4 = "ABC";
		
		System.out.println("-------------------------------");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s3.hashCode()+":"+s4.hashCode());//내용기반 hashcode()
		System.out.println(System.identityHashCode(s3)+":"+s3.hashCode());//주소기반 hashcode()
		System.out.println(System.identityHashCode(s4)+":"+s4.hashCode());//주소기반 hashcode()
	}
}
