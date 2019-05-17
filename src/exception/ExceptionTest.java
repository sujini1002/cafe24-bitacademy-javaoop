package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
		int a = 0;
		System.out.println("Some Codes.........");
		int k = 10000000 /a ;
		System.out.println("More Codes........1");
		System.out.println("More Codes........2");
		}catch(ArithmeticException e) {
			//catch문에서 하는 일(반드시 catch문 처리하기)- 복구처리는 하지 못한다.
			//1. 로그남기기....(파일로 남기기)
			System.out.println("error : "+e);
			//2. 사과(사용자들에게 시스템 오류를 보여주면 안됨 - 사용자용 오류페이지 보여주기)
			System.out.println("죄송합니다...");
			//3. 정상종료
			return;
			//4. 1~3이 안되는 경우
			//e.printStackTrace();
		}finally {
			//자원정리 구역
			System.out.println("자원해제");
		}
	}

}
