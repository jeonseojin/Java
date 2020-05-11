package day13;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 0;
		char op = '?';/*존재하지않는 산술연산*/
		try {
			switch(op) {
			case '+': System.out.println(num1+num2); break;
			case '-': System.out.println(num1-num2); break;
			case '*': System.out.println(num1*num2); break;
			case '/': System.out.println(num1/num2); break;
			case '%': System.out.println(num1%num2); break;
			default : throw new Exception(op+"는 산술 연산자가 아닙니다.");/*없을경우 Exception을 생성*/
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}
