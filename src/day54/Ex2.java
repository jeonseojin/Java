package day54;

public class Ex2 {

	public static void main(String[] args) {
		int num1=1;
		int num2=0;
		try {
		System.out.println(num1 / num2);
		/* 아래 throw를 작성하지 않으면 Exception1가 한번도 실행되지 않았기 때문에 에러가 발생한다.
		throw new Exception1();
		}catch(Exception1 e) {}*/
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(/*예외클래스들의 객체*/Exception e){
			e.printStackTrace();
		}
		System.out.println("프로그램종료");
	}
	public static void throwException() throws Exception {
		throw new Exception("예외");
	}
}
//class Exception1 extends Exception{
//	
//}